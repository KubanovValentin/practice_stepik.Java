package Zaur_OOP.podpaket_lesson28_days_time;

import java.time.*;
import java.time.format.DateTimeFormatter;


//свой формат
public class Test8 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(16, 40);
        LocalDate ld = LocalDate.of(2022, Month.AUGUST, 11);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.AUGUST, 11, 16, 40);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM,dd, yyyy, hh:mm");
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("месяц-MMM, день-d, год-yy,время- hh:mm" + " неделя-w");
        System.out.println(ldt);
        System.out.println(ldt.format(f));
        System.out.println(ldt.format(f1));
    }

}
