package practice_stepik;

import java.util.Scanner;
//Математические операторы
public class MyNumber {
    //вывод в консоль цифры 5
//    public static void main(String[] args) {
//        // put your code here
//        int myVar = 5;
//        System.out.print(myVar);
//    }
//    ----------------------------------------
//сложение
//    public static void main(String[] args) {
//        // put your code here
//        int sum1 = 50 + 10;
//        int sum2 = sum1 + 66;
//        int sum3 = sum2 + sum2;
//        System.out.print(sum3);
//    }
//    -------------------------
//вычитание
//    public static void main(String[] args) {
//        // put your code here
//        int sum1 = 1000 - 10;
//        int sum2 = sum1 - 5;
//        int sum3 = sum1 - sum2;
//        System.out.print(sum3);
//    }
// -------------------------
//    public static void main(String[] args) {
//        int x = 2; int y = 4;
//        // put your code here
//        int myVar = x + y ;
//        System.out.print(myVar);
//    }
//___________________________
//программа, которая получает два целых числа и выводит их сумму. 8 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        // put your code here
//        int myVar = x + y ;
//        System.out.print(myVar);
//    }
//    _____________________________
//умножение
//    public static void main(String[] args) {
//        // put your code here
//        int num1 = 1000 * 2;
//        int num2 = num1 * 10;
//        int num3 = num1 * num2;
//        System.out.print(num3);
//    }
//    -------------------------
//деление
//    public static void main(String[] args) {
//        // put your code here
//        int num1 = 1000 / 5;
//        int num2 = num1 / 2;
//        int num3 = num1 / num2;
//        System.out.print(num3);
//    }
//    -------------------------
    //На вход подаются два положительных действительных числа 5 10 - стороны прямоугольника.
    // Посчитайте его площадь и периметр и выведите на отдельных строках.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double myVarS = a * b;
//        double myVarP = (a + b) * 2;
//        System.out.println(myVarS);
//        System.out.println(myVarP);
//    }
//    ------------------------------
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double myVar = (5 * (x * x)) + (2 * x) + 11;
//        System.out.print(myVar);
//    }

//    ---------------------------------
//На вход подаётся целое число n. Выведите в одной строке через пробел само число, его квадрат и куб.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int myVarS = n * n;
        int myVarC= n * n * n;
        System.out.println(n + " " + myVarS + " " + myVarC);
    }
}
