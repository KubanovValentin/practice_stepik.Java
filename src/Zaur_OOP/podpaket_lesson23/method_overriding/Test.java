package Zaur_OOP.podpaket_lesson23.method_overriding;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.eat();

        Employee et = new Teacher();
        et.eat();

        Teacher t = new Teacher();
        t.eat();
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;


    void eat() {
        System.out.println("кушает работник");
    }

    void sleep() {
        System.out.println("спать");
    }
}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    @Override
    void eat() {
        System.out.println("кушает учитель");
    }

    void uchit() {
        System.out.println("учить");
    }

}