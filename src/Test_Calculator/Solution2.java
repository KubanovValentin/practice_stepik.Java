package Test_Calculator;

import java.util.Scanner;

/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
 */
public class Solution2 {
//    static final String plus="+";
    final static char plus='+';
    static int a;
    static int b;
    public static void main(String[] args) {
        boolean isExit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("wqewq1");

        while (!isExit && sc.hasNextInt()) {
            a= sc.nextInt();
            b=sc.nextInt();
            if (plus==sc.nextInt()){
                System.out.println(a+b);
            }
            String strVod = sc.nextLine();
            if(strVod.equals(sc.nextLine())){

            }
//            while (!sc.hasNextInt()){
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//            }
            System.out.println("vvod1");
            int a = sc.nextInt();



//            String strVod = sc.nextLine();
            if(isExit = strVod.equals("ENTER")){
                break;
            }
            isExit = strVod.equals("ENTER");
        }
//        System.out.println(sum);
    }
}
