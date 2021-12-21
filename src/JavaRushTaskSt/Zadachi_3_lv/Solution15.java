package JavaRushTaskSt.Zadachi_3_lv;
/*
Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
равны ли эти числа с точностью до одной миллионной.
 */
import java.util.Scanner;

public class Solution15 {
    private static final double accuracy=0.000001;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x= sc.nextDouble();
        double y=sc.nextDouble();
        if (Math.abs(y-x)<accuracy){
            System.out.println("числа равны");
        }else {
            System.out.println("числа не равны");
        }
    }
}
