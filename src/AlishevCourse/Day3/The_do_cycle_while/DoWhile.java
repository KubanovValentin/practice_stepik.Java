package AlishevCourse.Day3.The_do_cycle_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("введи 5");
        //плохой тон т.к повтор кода в теле цикла
//        int value= sc.nextInt();
//        while (value !=5){//пока условие true цикл выполняеться. а как только fulse прерывается и выводит ниже
//            System.out.println("введи 5");
//            //сдесь мы считаем то что с клавиатуры
//            value= sc.nextInt();
//        }
        int value;
        do {
            System.out.println("введи 5");
            value= sc.nextInt();
        }while (value!=5);

        System.out.println("вы ввели 5");
    }
}
