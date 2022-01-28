package JavaRushTaskSt.Zadachi_12.LV;
/*
Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
Исправь ошибку в коде, чтобы программа работала корректно.

Требования:
•	Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
 */
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String sLine=line;
        System.out.println(sLine.toLowerCase());
    }
}
