package Zaur_OOP.podpaket_lesson28_days_time;

import java.time.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, Month.SEPTEMBER, 1, 16, 40);
        System.out.println(ldt);
        LocalTime lt = LocalTime.of(21, 3);
        Period p = Period.ofMonths(3);/**/
        Duration d = Duration.ofHours(3);
        System.out.println(ldt.plus(d).plus(p));
    }


}
