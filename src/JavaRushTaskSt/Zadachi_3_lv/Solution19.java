package JavaRushTaskSt.Zadachi_3_lv;

import java.util.Scanner;

/*
Приведем только один простой пример: нужно ввести с клавиатуры две строки и определить, одинаковые они, или нет.
Вот как будет выглядеть этот код:
 */
public class Solution19 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        String result = a.equals(b) ? "Одинаковые" : "Разные";
        System.out.println(result);
    }
}
