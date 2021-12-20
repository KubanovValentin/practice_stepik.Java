package JavaRushTask.Zadachi_4.LV;

import java.util.Scanner;

/*
Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:

Нужно ввести с клавиатуры два целых числа.
Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
Вывести на экран результат деления первого числа на второе.
 */
public class Solution15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberCans= sc.nextInt();
        int numberEmployees= sc.nextInt();
        double result=(numberCans*1.0)/numberEmployees;
        System.out.println(result);
    }
}
