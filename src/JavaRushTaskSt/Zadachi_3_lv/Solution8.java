package JavaRushTaskSt.Zadachi_3_lv;

import java.util.Scanner;

/*
Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том,
что температура тела высокая, низкая или нормальная, в зависимости от условий.
В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные.
 */
public class Solution8 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bodyTemperature = sc.nextDouble();
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow) {
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
