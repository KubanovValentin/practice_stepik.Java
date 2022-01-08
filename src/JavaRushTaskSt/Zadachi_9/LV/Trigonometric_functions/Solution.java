package JavaRushTaskSt.Zadachi_9.LV.Trigonometric_functions;
/*
Реализуй методы sin(double), cos(double), tan(double)
которые возвращают синус, косинус и тангенс угла соответственно, полученного как параметр.
Угол задан в градусах.
В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.
 */
/*

Например, если вы хотите вычислить sin(45°), вот как можно это сделать:

Math.sin( Math.toRadians(45) )
 */
import static java.lang.Math.toRadians;
public class Solution {
    public static double sin(double a) {
        return Math.sin(toRadians(a));
    }

    public static double cos(double a) {
        //напишите тут ваш код
        return Math.cos(toRadians(a));
    }

    public static double tan(double a) {
        //напишите тут ваш код
        return Math.tan(toRadians(a));
    }
}
