package Zaur_OOP.podpaket_lesson30.Test15;

public class Test {
    public static void main(String[] args) {
        boolean b = false;
        if (b) {//false не сработает(только true)
            System.out.println("privet1");
        }
        while (b) {//false не сработает(только true)
            System.out.println("poka1");
        }
        if (1 != 1) {
            System.out.println("privet2");
        }
        /*
        while (1 != 1){//unreachable statement(писать так нельзя)
            System.out.println("poka2");
        }
        */

    }
}
