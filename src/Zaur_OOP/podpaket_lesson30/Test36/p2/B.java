package Zaur_OOP.podpaket_lesson30.Test36.p2;

import Zaur_OOP.podpaket_lesson30.Test36.p1.*;



public class B {
    static A a1 = new A();
    static A a2 = new A();

    {
        System.out.println("vsem horoshego dnay!");
    }

    public static void main(String[] args) {
        a1.x = 5;
        a2.x = 10;
        System.out.println(a1.x);
    }
}
