package JavaRushTaskSt.Zadachi_4.LV;
/*
1. Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа.
Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно,
а программа может быть завершена с ошибкой.
2. Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
 */
import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minFirstNumber = Integer.MAX_VALUE;
        int minSecondNumber = Integer.MAX_VALUE;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (minFirstNumber==x){
                continue;
            }else if (minFirstNumber > x) {
                minSecondNumber = minFirstNumber;
                minFirstNumber = x;
            } else {
                if ( minSecondNumber > minFirstNumber && minSecondNumber > x) {
                    minSecondNumber = x;
                }
            }
        }
        System.out.println(minSecondNumber);
    }
}
