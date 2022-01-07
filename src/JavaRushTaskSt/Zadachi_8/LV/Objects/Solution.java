package JavaRushTaskSt.Zadachi_8.LV.Objects;

import java.util.Scanner;

/*
Используя оператор new в методе main(), создай:

10 объектов типа String;
5 объектов типа int[] (массивов значений int);
2 объекта типа Scanner.
 */
public class Solution {
    public static void main(String[] args) {
        String str1=new String("Привет ");
        String str2=new String("мир");
        String str3=new String(",");
        String str4=new String("и ");
        String str5=new String("я ");
        String str6=new String("люблю ");
        String str7=new String("Java,");
        String str8=new String("хочу ");
        String str9=new String("скорее ");
        String str10=new String("обучиться.");


        int[] data1 = new int[1];
        int[] data2 = new int[2];
        int[] data3 = new int[3];
        int[] data4 = new int[4];
        int[] data5 = new int[5];

        Scanner sc1=new Scanner("LOVE ");
        Scanner sc2=new Scanner("Java");

        System.out.println(str1+str2+str3+str4+str5+str6+str7+str8+str9+str10);

    }
}
