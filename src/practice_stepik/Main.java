package practice_stepik;

import java.util.Scanner; //не забывать при исползовании сканера

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextLine());
//    }
//программа  будет ждать, пока пользователь введет что-то, а затем выведет на печать полученную строку.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        double y = sc.nextDouble();
//        String s = sc.nextLine();
//        sc.close();
//    }
//-------------------------------
    //мы вводим число и должны получить вывод такого же числа
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String st = sc.nextLine();
//            System.out.println(st);
//            sc.close();
//        }
    //водим имя и должны получить приветствие с именем
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            System.out.println("Hello," + " " + st);
            sc.close();
    }
}
