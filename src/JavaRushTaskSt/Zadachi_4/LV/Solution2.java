package JavaRushTaskSt.Zadachi_4.LV;

import java.util.Scanner;

/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
 */
public class Solution2 {
    public static void main(String[] args) {
        boolean isExit = false;
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (!isExit && sc.hasNextInt()) {
            int a = sc.nextInt();
            sum += a;
            String strVod = sc.nextLine();
            isExit = strVod.equals("ENTER");
        }
        System.out.println(sum);
    }
}
