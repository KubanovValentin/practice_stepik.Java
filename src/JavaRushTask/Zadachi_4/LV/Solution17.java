package JavaRushTask.Zadachi_4.LV;

import java.util.Scanner;

/*
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
В зависимости от полученных данных, округлить переменную glass:
до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.
 */
public class Solution17 {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner sc=new Scanner(System.in);
        boolean isOptimist= sc.nextBoolean();
        int result;
        if (isOptimist){
            result =(int)Math.ceil(glass);
        }else {
             result=(int)Math.floor(glass);
        }
        System.out.println(result);
    }
}
