package Zaur_OOP.podpaket_lesson30.Test5;

public class Test {
    static int j=5;
    static void abc(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        abc(j++);//5
        System.out.println(j);//6(5++)
    }
}
