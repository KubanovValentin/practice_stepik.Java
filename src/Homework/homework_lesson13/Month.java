package Homework.homework_lesson13;

import java.util.Scanner;

public class Month {
    int month;
    public void setMonth(int month){
        this.month=month;
    }
    public static void main(String[] args) {
        Month numberMonth = new Month();
        Scanner sc=new Scanner(System.in);
        numberMonth.setMonth(sc.nextInt());
        switch (numberMonth.month) {
            case 1:
                System.out.println("в январе 31 день");
                break;
            case 2:
                System.out.println("в феврале 28 дней");
                break;
            case 3:
                System.out.println("в марте 31 день");
                break;
            case 4:
                System.out.println("в апреле 30 дней");
                break;
            case 5:
                System.out.println("в мае 31 день");
                break;
            case 6:
                System.out.println("в июне 30 дней");
                break;
            case 7:
                System.out.println("в июле 31 день");
                break;
            case 8:
                System.out.println("в августе 31 день");
                break;
            case 9:
                System.out.println("в сентябре 30 дней");
                break;
            case 10:
                System.out.println("в октябре 31 день");
                break;
            case 11:
                System.out.println("в ноябре 30 дней");
                break;
            case 12:
                System.out.println("в декабре 31 день");
                break;
            default:
                System.out.println("введите правильный месяц");
        }

    }
}
