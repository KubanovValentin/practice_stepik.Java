package Zaur_OOP.podpaket_lesson28_days_time;

import java.time.*;

public class Test4 {

    static void smenaDejurstva(LocalDate startDay, LocalDate endDay, Period p) {
        LocalDate date = startDay;
        int count = 1;
        while (date.isBefore(endDay)) {
            count++;
            System.out.println("наступила дата: " + date + ". Пора менять класс-" + count);
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate startDay = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDate endDay = LocalDate.of(2039, Month.MAY, 31);
        //     Period p = Period.ofMonths(3);
        Period p = Period.of(1, 1, 28);
        smenaDejurstva(startDay, endDay, p);
    }
}
