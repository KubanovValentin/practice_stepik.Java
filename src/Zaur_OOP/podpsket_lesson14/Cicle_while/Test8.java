package Zaur_OOP.podpsket_lesson14.Cicle_while;

public class Test8 {
    public static void main(String[] args) {
        int chas = -1;
        OUTER:
        do {
            chas++;
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                //результат будет остановка на 30 минутах 24:29
                if (minuta == 30) {
                    continue OUTER;
                }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        } while (chas < 24);
    }
}
