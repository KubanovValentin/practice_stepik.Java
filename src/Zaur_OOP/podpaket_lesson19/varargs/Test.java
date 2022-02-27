package Zaur_OOP.podpaket_lesson19.varargs;

public class Test {
    static void summa(int a, int b) {
        System.out.println(a + b);
    }

    //если больше чисел сумма
    static void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void summa(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    //если нам нужно очень много суммировать? то на помощь приходит varargs
    static void summa1(int... a) {
        int summa1 = 0;
        for (int i = 0; i < a.length; i++) {
            summa1 += a[i];
        }
        System.out.println(summa1);
    }

    public static void main(String[] args) {
        summa(2, 3);
        summa1(1,2);
        summa1(5, 7, 4);
    }

}
