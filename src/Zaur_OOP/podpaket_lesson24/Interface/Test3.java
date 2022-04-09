package Zaur_OOP.podpaket_lesson24.Interface;

public class Test3 {

}

interface I1 {
    void abc();

    public default void ghj() { //default это не акцесс модифаер а public
        System.out.println("this method is ghj");
    }

    default void def() {
        System.out.println("this method is default");
    }
}

class Z2 implements I1 {
    public void abc() {
        System.out.println("this method is abc");
    }

    public static void main(String[] args) {
        Z2 z2 = new Z2();
        z2.abc();
        z2.def();
        z2.ghj();
    }
}