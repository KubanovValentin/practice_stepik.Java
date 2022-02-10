package Zaur_OOP.podpsket_lesson14.Cicle_for;


public class Test {
    public static void abc(int n){
        System.out.println("выполняется метод abc"+n);
    }

    public static void main(String[] args) {
        for (int i=1;i<5;i++,abc(1)){
            System.out.println("выполняется цикл");
        }
    }
}
