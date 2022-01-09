package JavaRushTaskSt.Zadachi_9.LV.Pauses_in_the_program;
/*
В классе Solution реализуй метод setTimer(int, int, int, int, int),
который засыпает на определенное время, используя соответствующие методы java.util.concurrent.TimeUnit.
 */
import java.util.concurrent.TimeUnit;
public class Solution3 {
//    public static void main(String[] args) throws InterruptedException {
//        setTimer(0,0,0,10,0);
//    }
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
