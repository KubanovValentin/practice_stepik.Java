package Andrey_Sumin_Object_oriented_programming.Collections.podpaket;

public class Main {
    public static void main(String[] args) {
        //создаем строковый массив с именами сотрудников
        //конечно если есть доступ к коду мы просто записываем в массив имя или удаляем
        // (но программа работает и доступа нет)
        String[] employees = {
                "Вася",
                "Петя",
                "Ваня",
                "Серега",
                "Вова",
                "Саша",
                "Коля"
        };
        //ввиду того что массив изменять нельзя и программа
        // работает добавляем сотрдника способом ниже
        // т.к к нам устроился новый сотрудник и его надо в бд добавить
        String[] second =new String[employees.length+1];
        for (int i = 0;i< employees.length;i++){
            second[i]=employees[i];
        }
        second[second.length-1]="Валек";
        employees=second;
        //проверяем и все работает
//        for (String name: employees){
//            System.out.println(name);
//        }
        //если сотрудник решил уволиться то
        employees[1]=null;
        String[] newNames=new String[employees.length-1];
        for (int i = 0,j=0;i< employees.length;i++){
            if (employees[i]!=null){
                newNames[j]=employees[i];
                j++;
            }
        }
        employees=newNames;
        for (String name: employees){
            System.out.println(name);
        }
    }
}
