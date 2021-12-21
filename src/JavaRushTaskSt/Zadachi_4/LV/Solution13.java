package JavaRushTaskSt.Zadachi_4.LV;

import java.util.Scanner;

/*
Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
 */
public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int number = sc.nextInt();

        do {
            if (number < 5) {
                number--;
            }
            System.out.println(str);

        } while (number > 0 && number < 5);

    }
}
