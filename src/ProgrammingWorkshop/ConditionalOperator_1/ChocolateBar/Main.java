package ProgrammingWorkshop.ConditionalOperator_1.ChocolateBar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int k= sc.nextInt();
        int s = n*m;
        int resultM=k%m;
        int resultN=k%n;
        if((n==k||m==k||resultM==0||resultN==0)&&k!=s&&k<s){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
