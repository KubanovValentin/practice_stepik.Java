package ProgrammingWorkshop.ConditionalOperator_1.TestingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==1 && b==1||a!=1&&b!=1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
