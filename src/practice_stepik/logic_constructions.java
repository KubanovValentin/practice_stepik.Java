package practice_stepik;

import java.util.Scanner;

public class logic_constructions {
    public static void main(String[] args){
//Исправьте программу таким образом, чтобы она выводила на печать приветствие "Добро пожаловать!".
//        int age = 23;
//        int tasks = 4000;
//        if (age > 21 & tasks > 500) {
//            System.out.print("Добро пожаловать!");
//        }
//----------------------------------------------
// На вход подаётся строка, а затем - одна буква.
// Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES", в противном случае - "NO".
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int x = str.length();
//        String str1 = sc.nextLine();
//        if (x > 20 || str.contains(str1)) {
//            System.out.print("YES");
//        } else {
//            System.out.print("NO");
//        }

// ------------------------------------------
// На вход подаются два целых числа.
// Выведите на печать true, если их сумма чётна, а произведение - нечётно, и false - в противном случае.

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a + b;
//        int sumE = sum % 2;
//        int inc = a * b;
//        int incO = inc % 2;
//        if (sumE == 0 && !(incO == 0)) {
//            System.out.print("true");
//        }else {
//            System.out.print("false");
//        }
//--------------------------------------------------
// На вход подаются три целых числа.
// Выведите true, если среди них есть ровно два чётных, и false - если нет.
//        Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int c = sc.nextInt();
//       int sum = a + b + c;
//       int inc = a * b * c;
//       if (sum % 2 != 0 && inc % 2 == 0) {
//           System.out.print("true");
//       }else {
//           System.out.print("false");
//       }
//-------------------------------------
// На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
// Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
//        Scanner sc = new Scanner(System.in);
//        int DD= sc.nextInt();
//        int MM = sc.nextInt();
//        int YY= sc.nextInt();
//
//        if (YY%4==0 && YY%100 !=0 || YY%400==0
//                && (DD>0 && DD<=29) && MM == 2) {
//            System.out.print("true");
//        } else if ((YY%4==0 && YY%100 !=0 || YY%400==0)&& (DD>0 && DD<=31) && !(MM % 2 == 0) && (MM>0 && MM<=12 && MM != 2)) {
//            System.out.print("true");
//        } else if ((YY%400==0 || YY%4==0 && YY%100 !=0) && (DD>0 && DD<=30) && (MM % 2 == 0) && (MM>0 && MM<=12 && MM != 2)){
//            System.out.print("true");
//        } else if ((YY>0 && YY<2023) && (MM>0 && MM<=12) && (MM != 2 ) && (MM%2==0 && DD>0 && DD<31)) {
//            System.out.print("true");
//        }else if ((YY>0 && YY<2023) && (MM>0 && MM<=12) && (MM != 2 ) && (!(MM%2==0) && DD>0 && DD<31)) {
//            System.out.print("true");
//        } else if ((YY>0 && YY<2023) && (MM == 2 && DD>0 && DD<29)){
//            System.out.print("true");
//        } else if (YY==1900 && MM==2 && DD==29) {
//            System.out.print("true");
//        } else {
//            System.out.print("false");
//        }
//---------------------------------------------------------------------------
// На вход подаются три слова на одной строке, разделённые пробелом.
// Выведите их в алфавитном порядке.
// Гарантируется, что слова начинаются с разных букв.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        char a = str1.charAt(0);
        char b = str2.charAt(0);
        char c = str3.charAt(0);

        char x;

        if (a > b) {
            x = a; a = b; b = x;

        } else a = a;
        if (b > c) {
            x = b; b = c; c = x;
        } else b=b;
        if (a > b) {
            x = a; a = b; b = x;
        } else c = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

// -----------------------------------------------------------
    }
}

