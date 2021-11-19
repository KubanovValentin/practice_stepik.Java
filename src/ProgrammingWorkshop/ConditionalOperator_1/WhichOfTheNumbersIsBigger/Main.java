package ProgrammingWorkshop.ConditionalOperator_1.WhichOfTheNumbersIsBigger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (a>b){
            System.out.println(1);
        }else if (b>a){
            System.out.println(2);
        }else {
            System.out.println(0);
        }
    }
}
