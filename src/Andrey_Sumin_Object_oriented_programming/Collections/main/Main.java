package Andrey_Sumin_Object_oriented_programming.Collections.main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees=new MyArrayList();
        employees.add("Вася");
        employees.add("Петя");
        employees.add("Коля");
        employees.add("Серж");
        employees.add("Таня");
        employees.add("Ваня");
       employees.remove("Вася");
//        for (int i=1;i<=100;i++){
//            employees.add("сотрудник "+i);
//        }
        for (int i=0;i< employees.getSize();i++){
            System.out.println(employees.get(i));
        }
    }
}
