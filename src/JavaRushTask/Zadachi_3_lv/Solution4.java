package JavaRushTask.Zadachi_3_lv;
/*
Считай с клавиатуры три строки.
        А затем:

        Выведи на экран третью строку в неизменном виде.
        Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
        Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.

 */
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
