package Zaur_OOP.podpaket_lesson12;

import java.util.Scanner;

public class Calculator {

    String str0 = "введите математический знак : сумма + ,вычитание - ,умножение * ,деление /";
    String str = "если хотите выйти из программы введите - end";
    String str1 = "введите первое число от 0 до 10";
    String str2 = "введите второе число от 0 до 10";
    String str3 = "сумма чисел равна : ";
    String str4 = "вычитание чисел равно : ";
    String str5 = "умножение чисел равно : ";
    String str6 = "деление чисел равно : ";
    String plus = "+";
    String min = "-";
    String umn = "*";
    String del = "/";
    String stop = "end";


}

class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isExit = false;
        System.out.println(calculator.str0);
        while (!isExit) {

            String zn = sc.nextLine();

            if (zn.equals(calculator.plus)) {
                System.out.println(calculator.str1);
                int a = sc.nextInt();
                System.out.println(calculator.str2);
                int b = sc.nextInt();
                int result = a + b;
                System.out.println(calculator.str3 + result);
                System.out.println();
                System.out.println(calculator.str);
                System.out.println(calculator.str0);
            } else if (zn.equals(calculator.min)) {
                System.out.println(calculator.str1);
                int a = sc.nextInt();
                System.out.println(calculator.str2);
                int b = sc.nextInt();
                int result = a - b;
                System.out.println(calculator.str4 + result);
                System.out.println();
                System.out.println(calculator.str);
                System.out.println(calculator.str0);
            } else if (zn.equals(calculator.umn)) {
                System.out.println(calculator.str1);
                int a = sc.nextInt();
                System.out.println(calculator.str2);
                int b = sc.nextInt();
                int result = a * b;
                System.out.println(calculator.str5 + result);
                System.out.println();
                System.out.println(calculator.str);
                System.out.println(calculator.str0);
            } else if (zn.equals(calculator.del)) {
                System.out.println(calculator.str1);
                int a = sc.nextInt();
                System.out.println(calculator.str2);
                int b = sc.nextInt();
                int result = a / b;
                System.out.println(calculator.str6 + result);
                System.out.println();
                System.out.println(calculator.str);
                System.out.println(calculator.str0);
            } else if (zn.equals(calculator.stop)) {
                isExit = true;
            }
        }
    }
}