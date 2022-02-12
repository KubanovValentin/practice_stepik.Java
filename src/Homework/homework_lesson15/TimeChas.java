package Homework.homework_lesson15;

public class TimeChas {
    public void vremya() {
        int chas = 0;
        OUTER:
        while (chas < 6) {

            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                int sekunda = 0;
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                while (sekunda < 60) {
                    if (sekunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                    sekunda++;
                }
            } while (minuta < 59);
            chas++;
        }
    }

    public static void main(String[] args) {
        TimeChas t = new TimeChas();
        t.vremya();
    }

}
