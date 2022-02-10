package Zaur_OOP.podpsket_lesson14.Cicle_while;

public class Test7 {
    public static void main(String[] args) {
        int chas = 0;
        OUTER:
        do {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
            chas++;
        } while (chas < 24);
    }
}
