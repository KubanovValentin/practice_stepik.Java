package practice_stepik;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class cycles {
    public static void main(String[] args) {


//   -----------------------------------while---------------------------------------
//        int x = 3;
//
//        while (x > 0) {
//            System.out.println(x);
//            x--;
//        }
//  ________________________________
//  Сколько раз код выведет на печать фразу "Java rocks!"?
//        int x = 12;
//
//        while (x < 100) {
//            x += 10;
//            System.out.println("Java rocks!");
//        }
//    ответ 9 без запуска кода
//__________________________________________________________________
//        int x = 6;
//
//        while (x < 10) {
//            System.out.println("Цикл исполняется");
//            System.out.println("x = " + x);
//            x++;
//        }
//        System.out.println("Цикл завершён");
//        System.out.println("x = " + x);
//-----------------------------------------------------------------------
// Что выведет на печать следующий код? (без запуска кода ответ)
//        int x = 5;
//        String s = "start";
//
//        while (x > 0) {
//            if (x < 10) {
//                s = "smaller";
//            } else {
//                s = "bigger";
//            }
//        }
//        s = "end";
//        System.out.println(s);
//ответ:Ничего из вышеперечисленного

//---------------------------------------------------
// На вход подаётся натуральное число n.
// Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = 1;
//        while (x <= n){
//            System.out.println(x);
//            x++;
//        }
//-------------------------------------------------------------------
// На ввод подаётся натуральное число n.
// Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел,
// если эти квадраты не превышают n.
//        Scanner sc = new Scanner(System.in);
//              int n = sc.nextInt();
//              int x = 1;
//              while ((x*x)<=n) {
//                  System.out.print((x*x) + " ");
//                  x++;
//              }
//        ------------------------------------------------------------------
//        Считайте со ввода последовательность целых чисел.
//        Последовательность оканчивается числом 0.
//        Выведите на печать сумму введённых чисел.
//        Scanner sc = new Scanner(System.in);
//        int x = 0;
//        int in = sc.nextInt();
//
//        while(in != 0) {
//            x = x + in;
//            in = sc.nextInt();
//        }
//        System.out.println(x);
//        -------------------------------------------------------------------------
//        На вход подаётся последовательность слов.
//        Посчитайте общее количество введённых слов.
//        Примечание.Так как маркер конца последовательности в этой задаче отсутствует,
//        будет удобно воспользоваться методом hasNext().
//        Найдите самостоятельно, как он работает.

//        Scanner s = new Scanner(System.in);
//        int num = 0;
//         while (s.hasNext()){
//             num++;
//             s.next();
//         }
//         System.out.print(num++);

//         ----------------------второй вариант решения

//        Scanner sc = new Scanner(System.in);
//        int res = 0;
//        while (sc.hasNext()) {
//            String ns = sc.next();
//            res++;
//
//        }
//        System.out.println(res);
//        sc.close();
//--------------------------------------------------------------
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//        } while (x < 5);
//        -------------------
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//        } while (x < 0);
//________________________________________________________
// Завершите программу таким образом, чтобы она вывела числа от 1 до 5,
// каждое на новой строке.
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//
//        } while(x<6);
// -----------------------------------------------------
//        int number = 3; // Возводимое в степень число
//        int result = 1; // Результат возведения в степень
//        int power = 1; // Начальный показатель степени
//        while(power <= 10) { // условие входа в цикл
//            result = result * number;
//            System.out.println(number + " в степени " + power + " = " + result);
//            power++;
//        }
//        --------------------------------

//        int number = 3;// Возводимое в степень число
//        int result = number;// Результат возведения в степень
//        int power = 1;// Начальный показатель степени
//        do {
//            System.out.println(number + " в степени " + power + " = " + result);
//            power++;
//            result = result * number;
//        }while (result < 10000); // условие выхода из цикла


//___________________________________________________________________
// На вход подаются числа, которые делятся на 11.
// Концом последовательности будет любое число, не делящееся на 11 (это число не входит в последовательность).
//Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.

//        Scanner sc = new Scanner(System.in);
//        int n = 0;
//        int count = 0;
//        int x = 0;
//        while (sc.hasNext()) {
//            n = sc.nextInt();
//            if (n%11==0) {
//                ++count;
//                if (n%3==0){
//                    x = x + n;
//                }
//            }else {
//                System.out.println(count);
//                System.out.println(x);
//            }
//        }
//-----------------------------------------------------
// На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма, выставленными зрителями.
// Если входящее число отрицательное или больше 10, последовательность прерывается.
// Посчитайте среднюю оценку фильма.
//        Scanner sc = new Scanner(System.in);
//        double x = 0;
//        int count = 0;
//        int n = 0;
//        double rez = 0;
//        while (sc.hasNext()){
//             n = sc.nextInt();
//            if(n>0 && n<11) {
//                x = x + n;
//                ++count;
//                rez = x/count;
//            }else {
//                System.out.println(rez);
//            }
//        }
// ----------------------------------------------------------
// На вход подаётся натуральное число.
// Выведите на печать составляющие его цифры в обратном порядке.

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        StringBuffer buffer = new StringBuffer(str);
//        buffer.reverse();
//        System.out.println(buffer);


//-------------------------------------------------------
// На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов.
// Выведите на печать все слова, которые начинаются на буквы,
// идущие по алфавиту между буквами с первой строки (включительно).
// Вывести слова необходимо в том же порядке, в котором они подаются на вход.

//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        String s2 = sc.next();
//
//         while (sc.hasNext()) {
//             String str = sc.next();
//             if (s1.charAt(0) <= str.charAt(0) && str.charAt(0) <= s2.charAt(0)) {
//                 System.out.println(str);
//             }
//        }


//--------------------------------------- циклы for -----------------------------

//        for (int i = 1; i >= 5; i++){
//            System.out.println(i);
//        }
//--------------------------------
// Завершите программу таким образом, чтобы она напечатала "Отлично!" 10 раз.
//        for (int i = 0; i <= 9; i++) {
//            System.out.println("Отлично!");
//        }
//        -------------------------------
//        Cколько раз выполнится цикл:

//        for (int i = 2; i < 50; i = i * i) {
//            System.out.println(i);
//        }
//ответ 3
//----------------------------------------------------------
// На вход подаётся натуральное число n.
// Выведите на печать в одной строке через пробел все числа от 1 до n включительно,
// которые одновременно без остатка делятся на 2 и на 3.
// Если таких чисел в диапазоне нет, выведите "Таких чисел нет".
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n<2*3){
//            System.out.println("Таких чисел нет");
//        }
//        for (int i = 1; i <= n; i++) {
//            if(i%2==0 && i%3==0) {
//                System.out.print(i +" ");
//
//            }
//        }
//
//
//----------------------------------------------------------

// на вход подаётся два натуральных числа - n и m.
// Напечатайте число n, повторённое m раз в одной строке через пробел.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        for(int i = 1; i <= m; i++) {
//            System.out.print(n +" ");
//        }

//------------------------------------------------------------
// На вход подаётся два натуральных числа x и y.
// Выведите на печать прямоугольник из звёздочек размером x*y.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//       for(int i = 1; i <= n; i++) {
//
//           for (int x = 1; x < m; x++){
//               System.out.print("*");
//           }
//           System.out.println("*");
//       }

//--------------------------------------------------------------
// Циклы можно исполнять друг внутри друга.
// Пусть нам дана строка, буквы которой мы хотим распечатать по следующему правилу:
//- если индекс буквы чётный - печатаем пять раз;
//- если нечётный - печатаем три раза.
//        String s = "Java";
//
//        for (int i = 0; i < s.length(); i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < 5; j ++) {
//                    System.out.print(s.charAt(i));
//                }
//            } else {
//                for (int j = 0; j < 3; j ++) {
//                    System.out.print(s.charAt(i));
//                }
//            }
//            System.out.println();    // Перевод строки
//        }

/*
JJJJJ
aaa
vvvvv
aaa
*/
//-----------------------------------------------------------------------
// На вход подаётся несколько целых чисел.
// Выведите эти числа, возведённые в степени от двух до пяти.
//Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
//Примечание. Каждая строка вывода оканчивается числом, а не пробелом.

//        Scanner sc = new Scanner(System.in);
//            while (sc.hasNext()) {
//                int a = sc.nextInt();
//                int result = a;
//                for (int x = 2; x < 6; x++) {
//                    result *= a;
//                    System.out.print(result + (x < 5 ? " " : ""));
//                }
//                System.out.println();
//            }
//----------------------------------------------------------------------------------------
// Напечатайте "лесенку" из чисел от единицы до n, n > 0.
//Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
//        Scanner sc = new Scanner(System.in);
//        int n =  sc.nextInt();
//        int step=1;
//        for(int i = 1; i <=n ; i++){
//            for(int j = 1; j <= i ; j+=1) {
//               System.out.print(j + (j < i ? " " : ""));
//            }
//            System.out.println();
//            }
//--------------------------------------------------------------------------------------------
//  Предположим, что мы работаем с последовательностью такого вида:1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ... .
//  Выведите на печать n (n > 0) членов данной последовательности в одну строку через пробел.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1,ckl=1; i <=n ; i++) {
//            for (int j = 1 ; j <= i && ckl <= n; j += 1) {
//                System.out.print(i + (j < n? " " : ""));
//                ckl++;
//            }
//        }
// ---------------------------------------------------------------------------
// Объединим две предыдущие задачи.
// Выведите "лесенку" из членов последовательности из предыдущего шага от единицы до n, n > 0.
//        Scanner sc = new Scanner(System.in);

//       Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int s = 0;
//        for (int i = 1; i <= num ; i++) {
//            int count= 1;
//            for (int j = 1; j <= i; j++) {
//                for (int k = 1; k <= j; k++) {
//                    if (count <= i) {
//                        System.out.print(j);
//                        if (count < i) {
//                            System.out.print(" ");
//                        }
//                    }
//                    count++;
//                }
////
//            }
//            if (i < num) {
//                    System.out.println();
//                }
//        }
//--------------------------------------------------
// вывести все четные числа от 1000 до 0
//        int i =1000;
//        while (i>=0){
//            if (i%2==0){
//                System.out.println(i);
//            }
//            i--;
//        }
//-------------------------------------------------
// посчитать среднее арифметическое всех чисел от 0 до 100(формула сумма всех чисел деленное на их количество)
//       int i=1;
//       int sum=0;
//       while (i<=100){
//
//           sum = sum + i;
//           i++;
//
//       }
//        float rez = sum / (float)i;
//        System.out.println(rez);

//-----------------------------------------------------
// вывести все нечетные числа от 100 до 100. которые деляться без остатка на 5

//        for(int x=100;x<=1000;x++){
//            if(x%2!=0){
//                if (x%5==0){
//                    System.out.println(x);
//                }
//            }
//        }
//-----------------второе решение
//        for (int i = 100; i <= 1000; i++) {
//            if (i % 2 == 1 && i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

    }
}

