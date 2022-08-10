package Zaur_OOP.podpaket_lesson28_days_time;

import java.time.*;

/*
мы через конструктор создать объект не можем потому чио у него приватные конструкторы, а создаем через методы
 */
public class Test1 {
    public static void main(String[] args) {
        /*
        System.out.println(LocalDate.now()+" this is LocalDate");
        System.out.println(LocalTime.now()+" this is LocalTime");
        System.out.println(LocalDateTime.now()+" this is LocalDateTime");
         */
        //  LocalDate ld=new LocalDate(2022,10,9); не можем так
        /*
        LocalDate ld = LocalDate.of(2026, 11, 9);
        System.out.println(ld);
        LocalDate ld1 = LocalDate.of(2023, Month.FEBRUARY, 9);
        System.out.println(ld1);
        LocalTime lt1=LocalTime.of(21,16);
        System.out.println(lt1);
        LocalTime lt2=LocalTime.of(21,16,45);
        System.out.println(lt2);
        LocalTime lt3=LocalTime.of(21,16,45,999999);
        System.out.println(lt3);
        LocalDateTime ldt1=LocalDateTime.of(2015,9,10,17,24);
        System.out.println(ldt1);
        LocalDateTime ldt2=LocalDateTime.of(ld,lt1);
        System.out.println(ldt2);
         */
        LocalDate ld = LocalDate.of(2026, 11, 9);
        System.out.println(ld);
        //       LocalDate ld2=ld.plusDays(5);
        //       System.out.println(ld2);
        ld = ld.plusDays(12);
        System.out.println(ld);
        ld=ld.minusDays(2);
        System.out.println(ld);
        //метод чейни
        LocalTime lt2=LocalTime.of(21,16,45);
        System.out.println(lt2);
        lt2=lt2.minusHours(1).plusSeconds(15).plusNanos(6);
        System.out.println(lt2);
    }
}
