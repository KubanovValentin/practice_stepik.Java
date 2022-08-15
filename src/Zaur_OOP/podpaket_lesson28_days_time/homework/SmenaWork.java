package Zaur_OOP.podpaket_lesson28_days_time.homework;

import java.time.*;
import java.time.format.*;

public class SmenaWork {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy,MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {

        LocalDateTime ldt1 = start;

        while (ldt1.isBefore(end)) {
            System.out.print("Работаем с: " + ldt1.format(f1));
            ldt1 = ldt1.plus(p);
            System.out.println(" До: " + ldt1.format(f1));
            System.out.print("Отдыхаем с : " + ldt1.format(f2));
            ldt1 = ldt1.plus(d);
            System.out.println(" До: " + ldt1.format(f1));
        }


    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 0, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);

        SmenaWork smenaWork = new SmenaWork();
        smenaWork.smena(ldt1, ldt2, p, d);

    }
}
