package Zaur_OOP.podpaket_lesson22_Inheritance;

public class Test3 {
}

class Human2 {
    String name;
    String surname;

    public Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
class Student3 extends Human2{
    int course;

    public Student3(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
    }

    void info(){
        System.out.println("Имя ученика: "+name);
        System.out.println("Фамилия ученика: "+surname);
        System.out.println("курс: "+course);
    }
    public static void main(String[] args) {
        Student3 s3=new Student3("Vasya","Dolban",4);
        s3.info();
    }

}
