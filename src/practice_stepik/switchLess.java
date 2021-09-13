package practice_stepik;
import java.util.Scanner;
public class switchLess {
    public static void main(String[] args){
//        int x = 10;
//        switch (10) {
//
//            case 10:
//                System.out.print("We're the champions!");
//                break;
//            default:
//                System.out.print("We're lost ((");
//        }
//        ------------------------------
//        int day = 1;
//
//        switch (day) {
//
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            default:
//                System.out.println("Wrong day's number");
//        }

//        ___________________________
//        Что выведет на печать следующий код?
//        int a = 11;
//        int b = 12;
//        int c = 42;
//
//        switch (a) {
//            case 40:
//                System.out.println(b);
//                break;
//            default:
//                System.out.println(с);
//        }

//42
//---------------------------------------
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;
            case "if":
                System.out.println("Это условный оператор");
                break;
            case "else":
                System.out.println("Это альтернативная конструкция условного оператора");
                break;
            default:
                System.out.println( "Раздел в разработке");
        }
    }
}
