package Zaur_OOP.podpaket_lesson28_days_time;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class Test9 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(16, 40);
        LocalDate ld = LocalDate.of(2022, Month.AUGUST, 11);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.AUGUST, 11, 16, 40);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1=LocalDate.parse("01 02 2023",f);
        System.out.println(date1);
        LocalDate date2=LocalDate.parse("2026-11-02");
        System.out.println(date2);
    }
}
