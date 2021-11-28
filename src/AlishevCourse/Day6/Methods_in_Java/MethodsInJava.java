package AlishevCourse.Day6.Methods_in_Java;

public class MethodsInJava {
    public static void main(String[] args) {
        Person person1=new Person();
        //чтобы метод speak выполнился надо его вызвать
        person1.name="Jon";
        person1.age=50;
        person1.speak();//у объекта person1 мы вызываем метод speak()
        person1.haHaHa();
        Person person2=new Person();
        person2.name="Jeck";
        person2.age=30;
        person2.speak();//у объекта person2 мы вызываем метод speak()
        person2.sayHello();
    }
}
class Person{
    //У класса могут быть:
    // 1. Данные(поля)
    // 2. Действия, которые он может совершать (методы)

    String name;
    int age;

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