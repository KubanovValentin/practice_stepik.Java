package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;
/*
Разберись, что делает программа.
В блоке catch выведи на экран переменную answer и брось дальше пойманное исключение.

Требования:
•	После ввода с клавиатуры "ок" программа должна завершаться исключением SecurityException.
•	В блоке catch в консоли должна выводиться переменная answer,
 чтобы после ввода с клавиатуры "ок" все ранее введенные строки вывелись в консоли в обратном порядке.
•	В блоке catch должно выбрасываться пойманное исключение, а не создаваться новое.
* */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}
