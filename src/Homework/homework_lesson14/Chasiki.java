package Homework.homework_lesson14;

public class Chasiki {
    public void chasi() {
        OUTER:
        for (int ch = 0; ch <= 6; ch++) {
            INNER_SER:
            for (int min = 0; min < 60; min++) {
                INNER_NIS:
                for (int sek = 0; sek < 60; sek++) {
                    System.out.println(ch + ":" + min + ":" + sek);
                    if (sek * ch > min) {
                        continue INNER_NIS;
                    }
                }
                if (ch > 1 && min % 10 == 0) {
                    break OUTER;
                }
            }
        }
    }

    public static void main(String[] args) {
        Chasiki chasiki = new Chasiki();
        chasiki.chasi();
    }
}
