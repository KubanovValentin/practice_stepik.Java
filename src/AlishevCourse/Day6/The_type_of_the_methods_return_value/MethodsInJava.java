package AlishevCourse.Day6.The_type_of_the_methods_return_value;



public class MethodsInJava {
    public static void main(String[] args) {
        Person person1=new Person();

        person1.name="Jon";
        person1.age=50;

        Person person2=new Person();
        person2.name="Jeck";
        person2.age=30;

        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();
        int year1=person1.calculateYearsToRetirement();
        int year2=person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии : "+year1+"лет");
        System.out.println("Второму человеку до пенсии : "+year2+"лет");
    }
}
class Person{
    //У класса могут быть:
    // 1. Данные(поля)
    // 2. Действия, которые он может совершать (методы)

    String name;
    int age;

    int calculateYearsToRetirement(){
        int years=65-age;
//        System.out.println("Количество лет до пенсии : "+years);
        return years;
    }
    //создаем метод говорить
    void speak(){
        System.out.println("Меня зовут "+name+","+ "мне "+age+" лет");

    }

    void haHaHa(){
        for (int i=0;i<3;i++){
            System.out.println("Ха-Ха-Ха");
        }
    }
    void sayHello(){
        System.out.println("Привет!!!");
    }
}