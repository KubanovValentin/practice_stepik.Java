package AlishevCourse.Day8.The_Object_class_and_the_toString_method;

public class Main {
    public static void main(String[] args) {
        //создаем объект и его выводим на экран
//        String string="Hello";
//        System.out.println(string);
        Human h1=new Human("Bob",40);

        System.out.println(h1.toSring());
    }
}
class Human{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toSring(){
        return name+","+age;
    }
}