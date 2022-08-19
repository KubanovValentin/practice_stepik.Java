package Zaur_OOP.podpaket_lesson30.Test27;

public class Test {
}

class A {
    int a = 3;

    int returnA() {
        System.out.println("KlassA " + a);
        return a;
    }
}

class B extends A {
    int a = 5;

    public int returnA() {
        System.out.println("KlassB " + a);
        return a;
    }

    public static void main(String[] args) {
        A test1 = new B();
        System.out.println(test1.a + " " + test1.returnA());
        B test2=(B)test1;
        System.out.println(test2.a + " " + test2.returnA());
    }
}