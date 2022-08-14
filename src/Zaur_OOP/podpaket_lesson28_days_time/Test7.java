package Zaur_OOP.podpaket_lesson28_days_time;

import java.time.LocalDateTime;
import java.time.*;
import java.time.format.*;

public class Test7 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, Month.AUGUST, 11, 16, 40);
        LocalDate ld = LocalDate.of(2022, Month.AUGUST, 11);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ldt.getYear());
        LocalTime lt = LocalTime.of(16, 40);
        System.out.println(ldt.getHour());
        System.out.println("-----------time.format-------------------------");
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(ld);
        System.out.println(ld.format(dtf));
        System.out.println(lt);
        System.out.println(lt.format(dtf2));
        System.out.println("----------------------------------------------");
        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(dtf3));
        System.out.println(ldt.format(dtf));
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("----------------------------------------------");
        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(dtf4));//2022-W32-4
        System.out.println("----------------------------------------------");

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortFormatT = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter shortFormatDT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ld);
        System.out.println(ld.format(shortFormat));
        System.out.println(ldt);
        System.out.println(ldt.format(shortFormatT));
        System.out.println(ldt.format(shortFormatDT));
        System.out.println("----------------------------------------------");
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(ldt.format(mediumFormat));
        System.out.println(mediumFormat.format(ldt));
    }
}

