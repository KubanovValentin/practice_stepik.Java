package JavaRushTaskSt.Zadachi_9.LV.Algebraic_functions;
/*
sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
 */
public class Solution {
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        if (power == 0) {
            return Math.pow(number,power);
        }

        int modulus = power < 0 ? power * -1 : power;
        int result = number;
        for (int i = 1; i < modulus; i++) {
            result *= number;
        }
        return power < 0 ? 1.0 / result : result;
    }
}
