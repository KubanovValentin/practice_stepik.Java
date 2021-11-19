package ProgrammingWorkshop.ArithmeticOperator.CarRally;

import java.util.Scanner;

public class CarRally {

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t=m/n;
        int c=m%n;
        if (c!=0){
            System.out.println(t+1);
        }else {
            System.out.println(t);
        }

    }
}
