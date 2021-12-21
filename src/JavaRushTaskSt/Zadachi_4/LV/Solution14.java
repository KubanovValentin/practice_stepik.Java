package JavaRushTaskSt.Zadachi_4.LV;

import java.util.Scanner;

/*
Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
 */
public class Solution14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius= sc.nextInt();
        if (radius>0){
            int sqr=(int) (radius*radius*Math.PI);
            System.out.println(sqr);
        }else {
            System.out.println("enter a positive number");
        }

    }
}
