package AlishevCourse.Day5.Classes_and_objects;

//public может быть только один и имя его должно соответствовать имени джава файла
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="Jon";
        person1.age=50;
        System.out.println("Меня зовут " + person1.name + "," + "мне " + person1.age + " лет");
        Person person2=new Person();
        person2.name="Jeck";
        person2.age=30;
        System.out.println("Меня зовут "+person2.name+","+ "мне "+person2.age+" лет");
    }
}
class Person{
    //У класса могут быть:
    // 1. Данные(поля)
    // 2. Действия, которые он может совершать (методы)

    String name;
    int age;

}