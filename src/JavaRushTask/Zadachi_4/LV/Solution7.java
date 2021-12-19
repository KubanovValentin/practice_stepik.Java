package JavaRushTask.Zadachi_4.LV;
/*
Программа должна считывать целые числа с клавиатуры до тех пор,
 пока не будет введено что-то другое: например, строка или символ.
Выведи на экран минимальное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.
 */
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 2147483647;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();

            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
