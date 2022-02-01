package Test_Calculator;

import java.util.Scanner;

public class Calculator {
    static String plus="+";
    static String min="-";
    static String umn="*";
    static String del="/";

    static void info(){
        System.out.println("введите символ для дальнейшего математического действия");
    }
    public static void main(String[] args) {
        info();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int a=sc.nextInt();
            
        }
    }
}
