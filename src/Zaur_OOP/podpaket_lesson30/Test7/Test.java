package Zaur_OOP.podpaket_lesson30.Test7;

public class Test {
    public static void main(String[] args) {
        int a=8;
        do {
            while (a++<12){//a=8,9,13,14
                a+=4;
            }
        }while (a<4);//a=14
        System.out.println(a);//14
    }
}
