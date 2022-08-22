package Zaur_OOP.podpaket_lesson30.Test39;

public class Test {
    static int a=3;
    static void abc(){
        int a=5;
        def();

    }
    static void def(){
        a+=2;
        ghi(a);
        System.out.println(a);
    }
    static void ghi(int a){
        a-=1;
    }

    public static void main(String[] args) {
        abc();
    }
}
