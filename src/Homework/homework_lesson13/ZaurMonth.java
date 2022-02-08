package Homework.homework_lesson13;

import java.util.Scanner;

public class ZaurMonth {
    public static void dayQuantity(int n){
        switch (n){
            case 2:
                System.out.println("в месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("в месяце 30 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("в месяце 31 день");
                break;
            default:
                System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dayQuantity(sc.nextInt());
    }
}
