package AlishevCourse.Day2.Data_entryThe_Scanner_class;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("введите что-нибудь");
        String string= sc.nextLine();
        System.out.println("спасибо за слово: "+string);
        System.out.println("введите число");
        int x= sc.nextInt();
        System.out.println("вы ввели число: "+x);
    }
}
