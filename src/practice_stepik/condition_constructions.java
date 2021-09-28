package practice_stepik;
import java.util.Scanner;
public class condition_constructions {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("YES");
//
//        }
//--------------------------------------------------------
//Два индийских программиста, Махатма и Джавахарлал, решили выяснить, кто из них быстрее пишет код.
// Напишите программу, которая поможет им выяснить это.
//
//На вход подаются два целых числа в одной строке через пробел.
// Если первое число больше второго, необходимо вывести на печать "Махатма", если второе - "Джавахарлал".
// Гарантируется, что числа больше нуля и различны.
//
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int d = sc.nextInt();
//        if (m > d) {
//           System.out.println("Махатма");
//        }else {
//            System.out.println("Джавахарлал");
//        }
//-----------------------------------------------------------------------
//Два индийских программиста, Махатма и Джавахарлал, решили выяснить, чей код длиннее.
// Напишите программу, которая поможет им выяснить это.
//На вход подаются две строки текста.
// Если первая строка длиннее второй, необходимо вывести на печать "Махатма", если наоборот - "Джавахарлал".
// Гарантируется, что строки имеют разную длину.
//        Scanner sc = new Scanner(System.in);
//        String m = sc.nextLine();
//        String d = sc.nextLine();
//        int ml = m.length();
//        int dl = d.length();
//        if (ml > dl) {
//            System.out.println("Махатма");
//        }else {
//            System.out.println("Джавахарлал");
//            }
//----------------------------------------------------
//На первой строке подаётся пароль, хранящийся в базе данных,
// на второй - пароль, введённый пользователем.
//Выведите на печать фразу "Access is granted",
// если пользователь ввёл верный пароль, и "Access is denied" - если нет.
//        Scanner sc = new Scanner(System.in);
//        int bd = sc.nextInt();
//        int pass = sc.nextInt();
//
//        if (bd == pass) {
//            System.out.println("Access is granted");
//        }else {
//            System.out.println("Access is denied");
//        }

// т.к при вводе пароля присутствуют не только цифры но и буквы с символами правильно так
//        Scanner sc = new Scanner(System.in);
//        String bd = sc.nextLine();
//        String pass = sc.nextLine();
//
//        if (bd.equals(pass)) {
//            System.out.println("Access is granted");
//        } else {
//           System.out.println("Access is denied");
//       }
//------------------------------------------------------
//Выведите на печать наибольшее из трёх целых чисел.
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        if (x > y && y > z) {
//            System.out.println(x);
//        } else if ( y > z && z > x) {
//            System.out.println(y);
//        } else {
//            System.out.println(z);
//        }
//        ---------------------------------------------------------
//В 1997 году во время боксёрского боя за звание чемпиона мира Майк Тайсон откусил ухо Эвандеру Холифилду (не целиком).
// Рефери нужно определить, как поступить. Если откушенный кусок уха меньше норматива, бой продолжится.
// Если нет - Майк Тайсон должен быть дисквалифицирован, и чемпионом становится Холифилд.
//На вход подаются два числа -  масса откушенного куска уха и норматив.
// Выведите "Бой продолжается!" или "Холифилд - чемпион!" в зависимости от выполнения условия.
//        Scanner sc = new Scanner(System.in);
//        double m = sc.nextDouble();
//        double norm = sc.nextDouble();
//        System.out.println((m < norm) ? "Бой продолжается!" : "Холифилд - чемпион!");
//_______________________________________________________________________________
//На вход подаётся целое число n. Выведите "YES",
// если можно построить правильный многогранник из правильных плоских n-угольников,
// в противном случае - "NO".

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println((n == 3) ? "YES" : (n == 4) ? "YES" :(n == 5) ? "YES" :"NO");
//-------------------------------------------------------
//На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, и "NO" - если нет.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = n % 7;
//        if (x == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//(System.out.print((sc.nextInt()%7==0)? "YES" : "NO");)
//        ---------------------------------------------------
//На вход подаётся целое число.
// Выведите "YES", если оно нацело делится на 7, но не делится на 5, и "NO" - в обратном случае.
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int x = n % 7;
       int y = n % 5;
        if (x == 0 && y != 0) {
           System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}