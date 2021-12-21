package JavaRushTaskSt.Zadachi_3_lv;
/*
Напишем программу, которая будет считывать с клавиатуры возраст.
Если возраст от 20 до 60 (включительно), то выводить ничего не нужно,
иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!) с помощью только одного оператора if без else.
 */

import java.util.Scanner;

public class Solution11 {
    private static final String notWorking = "можно не работать";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if (year<20||year>60)
            System.out.println(notWorking);

    }
}
