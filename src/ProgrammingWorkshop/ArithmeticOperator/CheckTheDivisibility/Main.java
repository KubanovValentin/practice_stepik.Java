package ProgrammingWorkshop.ArithmeticOperator.CheckTheDivisibility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x=a%b;
        int y=b%a;
        if (x==0||y==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
