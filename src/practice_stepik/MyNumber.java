package practice_stepik;

import java.util.Scanner;
//Математические операторы
public class MyNumber {
    //вывод в консоль цифры 5
//    public static void main(String[] args) {
//        // put your code here
//        int myVar = 5;
//        System.out.print(myVar);
//        sc.close();
//    }
//    ----------------------------------------
//сложение
//    public static void main(String[] args) {
//        // put your code here
//        int sum1 = 50 + 10;
//        int sum2 = sum1 + 66;
//        int sum3 = sum2 + sum2;
//        System.out.print(sum3);
//        sc.close();
//    }
//    -------------------------
//вычитание
//    public static void main(String[] args) {
//        // put your code here
//        int sum1 = 1000 - 10;
//        int sum2 = sum1 - 5;
//        int sum3 = sum1 - sum2;
//        System.out.print(sum3);
    //        sc.close();
//    }
// -------------------------
//    public static void main(String[] args) {
//        int x = 2; int y = 4;
//        // put your code here
//        int myVar = x + y ;
//        System.out.print(myVar);
    //        sc.close();
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
    //        sc.close();
//    }
//    _____________________________
//умножение
//    public static void main(String[] args) {
//        // put your code here
//        int num1 = 1000 * 2;
//        int num2 = num1 * 10;
//        int num3 = num1 * num2;
//        System.out.print(num3);
    //        sc.close();
//    }
//    -------------------------
//деление
//    public static void main(String[] args) {
//        // put your code here
//        int num1 = 1000 / 5;
//        int num2 = num1 / 2;
//        int num3 = num1 / num2;
//        System.out.print(num3);
    //        sc.close();
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
    //        sc.close();
//    }
//    ------------------------------
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double myVar = (5 * (x * x)) + (2 * x) + 11;
//        System.out.print(myVar);
    //        sc.close();
//    }

//    ---------------------------------
//На вход подаётся целое число n. Выведите в одной строке через пробел само число, его квадрат и куб.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int myVarS = n * n;
//        int myVarC= n * n * n;
//        System.out.println(n + " " + myVarS + " " + myVarC);
//        sc.close();
//    }
//________________________________
  //На вход подаётся три числа. Выведите на одной строке их среднее арифметическое.
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          double x = sc.nextDouble();
//          double y = sc.nextDouble();
//          double z = sc.nextDouble();
//          double myVar = (x + y + z) / 3;
//          System.out.print(myVar);
//        sc.close();
//      }
//    ________________________________________
// Завершите программу таким образом, чтобы она выводила на печать остаток от деления 41 на 7.
//          public static void main(String[] args) {
//              int x = 41; int y = 7;
//              int myVar = x % y;
//              // put your code here
//              System.out.print(myVar);
//        sc.close();
//          }
//    ______________________________
 //На вход подаётся целое число. Найдите его последнюю цифру.Для вычислений может понадобиться метод Math.abs(x)
//          public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);
//              int x = sc.nextInt();
//              System.out.print(Math.abs(x % 10));
//        sc.close();
//          }
//----------------------------------------------------------
//     ООО "Круче Гугла" нанимает Java-разработчиков.
//     Месячный бюджет на зарплату разработчиков - X, зарплата одного разработчика - Y.
//     Выведите на печать в одной строке через пробел,
//     какое максимальное количество разработчиков компания сможет нанять,
//     и какое количество денег из ежемесячного бюджета останется неиспользованным.
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                int x = sc.nextInt();
//                int y = sc.nextInt();
//                int n = x / y;
//                int b = x % y;
//                System.out.println(n + " " + b);
//                sc.close();
//            }
//  ______________________________________________

   // Реализуйте простые домашние часы.
   // На вход подаётся число секунд, которое прошло с момента начала суток (00:00:00).
   // Выведите текущее время в формате ЧЧ:ММ:СС.
    //Примечание 1. Используйте 24-часовой формат.

//                public static void main(String[] args) {
//                      Scanner sc = new Scanner(System.in);
//                      int x = sc.nextInt();
//                      int h =  (x % 86400 ) / 3600   ;
//                      int m = ((x % 86400 ) % 3600 ) / 60;
//                      int s =((x % 86400 ) % 3600 ) % 60;
//                    System.out.format("%02d:%02d:%02d", h, m, s);
//                    sc.close();
//              }

// --------------------------------------------------------------------------------------------------------
//    тема - инкременты

    public static void main(String[] args) {
//        int x = 10;
//        ++x;
//        // put your code here
//        System.out.print(x);
//    }
//-----------------------
//        int x = 1, y = 1;
//        x++;
//        x -= ++y;
//        System.out.print(x);
//    }
//__________________________
//        int a = 5;
//        boolean b;
//        int c = 4;
//        b = c++ == 4 && a++ < 6;
//Чему будут равны значения переменных после выполнения кода
//        6,true,5
//    }
//        _____________________________________
//        int x = 1, y = 5, z = 0;
//        --y;//x=1 y=5 z=0
//        x = 4 + y++;//x=1 y=4 z=0
//        z += x--;//x=8 y=5 z=0
//        x = y + z;//x=7 y=5 z=8
//        System.out.print(++x);//x=13 y=5 z=8
//    }//x=14 y=5 z=8
//------------------------------------------
// Измените программу таким образом, чтобы она выводила на печать числа 11, 12, 13. Используйте инкремент.
//        int x = 10;
//        // put your code here
//        System.out.println(++x);
//        System.out.println(++x);
//        System.out.println(++x);
//    }
//-------------------------------------------------
//        оператор присваивания
        //Завершите программу таким образом, чтобы она выводила на печать число 13.
//        int x = 25;
//        int y = 12;
//        x-=y;
//        // put your code here
//        System.out.print(x);
//    }
//----------------------------------------------
// На вход подаётся натуральное число n.
// Выведите на печать числа n - 1, n, n + 1 в одну строку, через пробел (образец 9 10 11).

//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int x = --n;
//            int y = ++n;
//            int z = ++n;
//            System.out.println( x + " " + y + " " +z);
//
//        }
//        ___________________________________________________
        //На вход подаются два числа: x и y.
        //Выведите на печать значение выражения


        Scanner sc = new Scanner(System.in);
           int x = sc.nextInt();
           int y = sc.nextInt();
           int z = (x + 1) / (y - 1 ) + (y + 1) / (x - 1);
        System.out.println(z);
    }
}
