package Zaur_OOP.podpaket_lesson28_days_time;
import java.time.*;
public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2026, 11, 9);
        LocalDate ld2 = LocalDate.of(2023, 10, 1);
        System.out.println(ld1.equals(ld2));////сравнение
        System.out.println(ld2.isAfter(ld1));//лд2 был после лд1
        System.out.println(ld1.isAfter(ld2));// лд1 был после лд2
        System.out.println(ld2.isBefore(ld1));// лд2 был до лд1

        LocalTime lt1=LocalTime.of(21,16);
        LocalDateTime ldt1=LocalDateTime.of(2015,9,10,17,24);
    }
}
