package Zaur_OOP.podpaket_lesson26.primer_test;

public class Test3 {
    public static void main(String[] args) {
        Animal an=new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}

class Animal {
    int a = 5;
    static int b = 10;

    void abc() {
        System.out.println("non-static method class Animal");
    }

    void def() {
        System.out.println("static method class Animal");
    }

}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;

    void abc() {
        System.out.println("non-static method class Tiger");
    }

    void def() {
        System.out.println("static method class Tiger");
    }

}