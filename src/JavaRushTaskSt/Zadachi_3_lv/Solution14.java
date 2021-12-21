package JavaRushTaskSt.Zadachi_3_lv;

import java.util.Scanner;

/*
Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
Перепиши программу без использования тернарного оператора.
 */
public class Solution14 {
    private static final String resultM="число меньше 5";
    private static final String resultB="число больше 5";
    private static final String resultR="число равно 5";

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number<5){
            System.out.println(resultM);
        }else if (number>5){
            System.out.println(resultB);
        }else {
            System.out.println(resultR);
        }
    }
}
