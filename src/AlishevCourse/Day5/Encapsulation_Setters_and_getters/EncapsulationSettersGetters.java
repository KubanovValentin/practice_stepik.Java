package AlishevCourse.Day5.Encapsulation_Setters_and_getters;

public class EncapsulationSettersGetters {
    public static void main(String[] args) {
       Person person1=new Person();
       person1.setName("Valentin");
       person1.setAge(25);
        System.out.println("выводим значение в main методе: "+person1.getName());
        System.out.println("выводим значение в main методе: "+person1.getAge());
//        System.out.println("выводим значение в main методе: "+person1.calculateYearsToRetirement());

//       person1.speak();
    }
}
class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("ERROR!!!"+"\nты ввел пустое имя");
        }else{
            name=userName;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("ERROR!!!"+"\nвозраст должен быть больше 0");
        }else {
            age=userAge;
        }

    }
    public int getAge(){
        return age;
    }
    int calculateYearsToRetirement(){
        int years=65-age;
//        System.out.println("Количество лет до пенсии : "+years);
        return years;
    }

    void speak(){
        for (int i=0;i<3;i++){
            System.out.println("Меня зовут "+name+","+ "мне "+age+" лет");
        }
    }
}