package JavaRushTask.Zadachi_3_lv;
/*
У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
Если числа одинаковые, то выводится любое.
Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.
 */
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        // if (numberA > numberB) {
        //     System.out.println(numberA);
        // } else {
        //     System.out.println(numberB);
        // }
        System.out.println(numberA > numberB?numberA:numberB);
    }
}
