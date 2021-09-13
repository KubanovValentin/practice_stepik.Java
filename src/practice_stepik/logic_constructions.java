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
//        if(a<=b){
//            if(b<=c) {
//                System.out.println(str1);
//                System.out.println(str2);
//                System.out.println(str3);
//            }else {
//                if(a<=c){
//                    System.out.println(str1);
//                    System.out.println(str3);
//                    System.out.println(str2);
//                }else {
//                    System.out.println(str3);
//                    System.out.println(str1);
//                    System.out.println(str2);
//                }
//            }
//        }else {
//            if(c<=b){
//                System.out.println(str3);
//                System.out.println(str2);
//                System.out.println(str1);
//            }else {
//                if (a<=c){
//                    System.out.println(str2);
//                    System.out.println(str1);
//                    System.out.println(str3);
//                }else {
//                    System.out.println(str2);
//                    System.out.println(str3);
//                    System.out.println(str1);
//                }
//            }
//        }

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
//        Scanner sc = new Scanner(System.in);
//        int pay1 = sc.nextInt();
//        int pay2 = sc.nextInt();
//        int pay3 = sc.nextInt();
//        int raz =  sc.nextInt();
//        int sum1=pay2-pay1;
//        int sum2=pay1-pay2;
//        int sum3=pay3-pay2;
//        int sum4=pay2-pay3;
//        int sum5=pay3-pay1;
//        int sum6=pay1-pay3;
//            if (sum1<=raz && sum2<=raz && sum3<=raz && sum4<=raz &&sum5<=raz && sum6<=raz){
//                System.out.println("За работу, Солнце ещё высоко");
//            } else if (sum1>raz || sum2>raz || sum3>raz || sum4>raz ||sum5>raz || sum6>raz){
//                System.out.println("Ура, бастуем!");
//        }
//-------------------------------------------------
// На вход подаётся три целых числа.
// Выведите максимальное чётное из них. Если чётных чисел нет, выведите "Чётных чисел нет".
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(a<=b){
//            if(b<=c){
//                if(c%2==0){
//                    System.out.println(c);
//                }else if (b%2==0) {
//                    System.out.println(b);
//                }else if (a%2==0) {
//                    System.out.println(a);
//                }else {
//                    System.out.println("Чётных чисел нет");
//                }
//            }else {
//                if (a<=c) {
//                     if (b%2==0) {
//                        System.out.println(b);
//                     }else if (c%2==0) {
//                         System.out.println(c);
//                     }else if (a%2==0) {
//                         System.out.println(a);
//                     }else {
//                         System.out.println("Чётных чисел нет");
//                     }
//                }else {
//                    if (b%2==0) {
//                        System.out.println(b);
//                    }else if (a%2==0) {
//                        System.out.println(a);
//                    }else if (c%2==0) {
//                        System.out.println(c);
//                    }else {
//                        System.out.println("Чётных чисел нет");
//                    }
//                }
//            }
//        }else {
//            if (c<=b){
//                if (a%2==0) {
//                    System.out.println(a);
//                }else if (b%2==0) {
//                    System.out.println(b);
//                }else if (c%2==0) {
//                    System.out.println(c);
//                }else {
//                    System.out.println("Чётных чисел нет");
//                }
//            }else {
//                if (a<=c) {
//                    if (c%2==0) {
//                        System.out.println(c);
//                    }else if (b%2==0) {
//                        System.out.println(b);
//                    }else if (a%2==0) {
//                        System.out.println(a);
//                    }else {
//                        System.out.println("Чётных чисел нет");
//                    }
//                } else {
//                    if (a%2==0) {
//                        System.out.println(a);
//                    }else if (c%2==0) {
//                        System.out.println(c);
//                    }else if (b%2==0) {
//                        System.out.println(b);
//                    }else {
//                        System.out.println("Чётных чисел нет");
//                    }
//                }
//            }
//        }
//        _____________________________________________________
//        На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
//        Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
//
//                Scanner sc = new Scanner(System.in);
//                int day = sc.nextInt();
//                int mouth = sc.nextInt();
//                int year = sc.nextInt();
//                if ((day >= 1 && day <= 31) && (mouth >= 1 && mouth <= 12) && year >= 0) {
//                    if (day <= 31 && (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 || mouth == 8 || mouth == 10 || mouth == 12)) {
//                        System.out.println("true");
//                    } else if (day == 29 && mouth != 2) {
//                        System.out.println("true");
//                    } else if (day <= 30 && (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11)) {
//                        System.out.println("true");
//                    } else if (day == 29 && mouth == 2 && (year % 4 == 0 || year % 400 == 0) && (year % 100 != 0)) {
//                        System.out.println("true");
//                    } else{
//                        System.out.println("false");
//                    }
//
//                } else {
//                    System.out.println("false");
//                }
//---------------------------------------------------------------------------------------------------------
// На числовой прямой даны два отрезка.Напишите программу, которая находит их пересечение.
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        if (a1<b1 && a2<b2) {
            if ((a1<a2 && a1<b2)&&(b1<a2 && b1<b2)|| (a1>a2 && a1>b2) && (b1>a2 && b1>b2)) {
                System.out.println("Пересечения нет");
            } else if ((a1<a2 && a1<b2) && (b1>a2 && b1>b2)){
                System.out.println(a2 + " " + b2);
            }else if ((a1>a2 && a1<b2) && (b1>a2 && b1<b2)) {
                System.out.println(a1 + " " + b1);
            }else if (a1==a2 && b1==b2) {
                System.out.println(a1 + " " + b1);
            }else if(a1<b2 && a1< b1 && b1==a2) {
                System.out.println(a2);
            }else if (a2<b1 && a2<a1 && a1==b2) {
                System.out.println(a1);
            }else if ((a1==a2 && a1<b1 && b1<b2) || (b1==b2 && a2<a1 && a1 < b1)){
                System.out.println(a1 + " " + b1);
            }else if((b1==b2 && a1<a2 && a2<b1) || (a1==a2 && b2<b1 && a1<b2 )) {
                System.out.println(a2 + " " + b2);
            }else if (a1<a2 && a2<b1 && b1<b2 && a1<b2){
                System.out.println(a2 + " " + b1);
            }else if (a2<a1 && a1<b2 && b2<b1 && a2<b1){
                System.out.println(a1 + " " + b2);
            }
        }

    }
}

