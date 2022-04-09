package Zaur_OOP.podpaket_lesson24.Interface;

import java.util.ArrayList;

public class Test4 {

}

interface I2 {
    public default void abc() {
        System.out.println("this method is abc");
    }

    public default void abc2() {
        System.out.println("this method is abc2");
    }

    static void def() {
        System.out.println("static method 1");
    }
}

interface I2_1 {
    static void def() {
        System.out.println("static method 2");
    }
}

interface I3 extends I2 {
    void abc();

}

abstract class R implements I2, I2_1 {
    public void abc() {
        System.out.println("this method is abc!!!");
    }

    abstract public void abc2();

    public static void main(String[] args) {
        I2.def();//только обращаясь к interface I2 можно запустить static void def
        I2_1.def();
    }
}

class E {
    E method1() {
        return new E();
    }
}
abstract class W{

}
class Q extends W{
    W method2() {
        return new Q();
    }
}