package Zaur_OOP.podpaket_lesson28_days_time;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate startDay = LocalDate.of(2022, Month.SEPTEMBER, 1);
        /*
        Period p = Period.ofMonths(12).ofDays(3);//сдесь только по ofDays(3) выполниться код
         */
        System.out.println(startDay);
        Period p = Period.ofMonths(12);
        System.out.println(startDay.plus(p));
        p = Period.ofDays(3);
        System.out.println(startDay.plus(p));
    }
}
