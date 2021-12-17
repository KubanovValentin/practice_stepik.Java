package JavaRushTask.Zadachi_3_lv;
/*
Напиши программу,
которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 */
import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String srt1=sc.nextLine();
        String str2=sc.nextLine();
        if (srt1.equals(str2)){
            System.out.println("строки одинаковые");
        }else {
            System.out.println("строки разные");
        }
    }
}
