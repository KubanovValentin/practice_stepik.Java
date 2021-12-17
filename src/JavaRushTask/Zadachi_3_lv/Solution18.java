package JavaRushTask.Zadachi_3_lv;

import java.util.Scanner;

/*
Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура,
и теперь невозможно набирать буквы в верхнем регистре.
Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
Если введенная строка равна строке из переменной secret,
программа выводит на экран сообщение "доступ разрешен". В ином случае - "доступ запрещен".
 */
public class Solution18 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
//        //напишите тут ваш код
//        System.out.println("доступ разрешен");
//        //напишите тут ваш код
//        System.out.println("доступ запрещен");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        if (secret.equalsIgnoreCase(str)){
            System.out.println("доступ разрешен");
        }else {
            System.out.println("доступ запрещен");
        }
    }
}
