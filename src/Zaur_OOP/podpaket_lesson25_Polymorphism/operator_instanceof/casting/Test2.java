package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting;

public class Test2 {
    public static void main(String[] args) {
        Jampable j = new Man();
        Man m = new Man();
        Student st = new Student();
        if (j instanceof Jampable) {
            System.out.println("j is Jampable");
        }
        if (m instanceof Human) {
            System.out.println("m is Human");
        }
    }
}

interface Jampable {
}

class Human implements Jampable {
}

class Man extends Human {
}

class Student {
}