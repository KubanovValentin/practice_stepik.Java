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
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        String str3 = sc.next();
//        char a = str1.charAt(0);
//        char b = str2.charAt(0);
//        char c = str3.charAt(0);
//
//        char x;
//
//        if (a > b) {
//            x = a; a = b; b = x;
//
//        } else a = a;
//        if (b > c) {
//            x = b; b = c; c = x;
//        } else b=b;
//        if (a > b) {
//            x = a; a = b; b = x;
//        } else c = c;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        не решенные задачи 3.3 последние 2

// -----------------------------------------------------------
// Исправьте программу таким образом, чтобы она вывела на печать "Ура, заработало!!!" (без кавычек).
//        int x = 3;
//        if (x < 15) {
//            if (x <= 25) {
//                System.out.println("Ура, заработало!!!");
//            }
//        }
//----------------------------------------------------
// На вход подаётся три целых числа.
// Выведите минимальное из них .
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a < b) {
//            if (a < c) {
//                System.out.println("минимальное число " + a);
//            }else {
//                System.out.println("минимальное число " + c);
//            }
//        }else {
//            if(b > c) {
//                System.out.println("минимальное число " + b);
//            }else {
//                System.out.println("минимальное число " + c);
//            }
//        }
//        -----------------------------------------------
//        На вход подаётся три целых числа.
//        Выведите среднее из них (т.е. не минимальное и не максимальное).
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//            if(a<=b) {
//                if(b<=c){
//                    System.out.println(b);
//                }else {
//                    if(a<=c) {
//                        System.out.println(c);
//                    }else {
//                        System.out.println(a);
//                    }
//                }
//            }else {
//                if (c<=b){
//                    System.out.println(b);
//                }else {
//                    if (a<=c) {
//                        System.out.println(a);
//                    }else {
//                        System.out.println(c);
//                    }
//                }
//            }
// -----------------------------------------------------------
// ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали, что их зарплаты различаются.
// Разработчики решили объявить забастовку,
// если разница максимальной и минимальной зарплаты превысит определённый уровень.
// Определите, грозит ли ООО "Круче Гугла" забастовка.
        Scanner sc = new Scanner(System.in);
        int pay1 = sc.nextInt();
        int pay2 = sc.nextInt();
        int pay3 = sc.nextInt();
        int sum1=pay2-pay1;
        int sum2=pay1-pay2;
        int sum3=pay3-pay2;
        int sum4=pay2-pay3;
        int sum5=pay3-pay1;
        int sum6=pay1-pay3;
            if (sum1<=100 && sum2<=100 && sum3<=100 && sum4<=100 &&sum5<=100 && sum6<=100){
                System.out.println("За работу, Солнце ещё высоко");
            } else if (sum1>100 || sum2>100 || sum3>100 || sum4>100 ||sum5>100 || sum6>100){
                System.out.println("Ура, бастуем!");
        }
//        if((pay1-pay2)>100 && (pay2-pay1)>100
//                && (pay2-pay3)>100 && (pay3-pay2)>100
//                && (pay1-pay3)>100 && (pay3-pay1)>100){
//            System.out.println("Ура, бастуем!");
//        }else if ((pay1-pay2)<=100 && (pay2-pay1)<=100
//                && (pay2-pay3)<=100 && (pay3-pay2)<=100
//                && (pay1-pay3)<=100 && (pay3-pay1)<=100){
//            System.out.println("За работу, Солнце ещё высоко");
//        }
    }
}

