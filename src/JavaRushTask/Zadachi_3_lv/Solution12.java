package JavaRushTask.Zadachi_3_lv;
/*
Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x",
а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
 */
import java.util.Scanner;

public class Solution12 {
    private static final String firstQuarter = "1";
    private static final String secondQuarter = "2";
    private static final String thirdQuarter = "3";
    private static final String fourthQuarter = "4";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(firstQuarter);
        } else if (x < 0 && y > 0) {
            System.out.println(secondQuarter);
        } else if (x < 0 && y < 0) {
            System.out.println(thirdQuarter);
        } else if (x > 0 && y < 0) {
            System.out.println(fourthQuarter);
        }
    }
}
