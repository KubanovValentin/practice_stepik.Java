package ProgrammingWorkshop.ConditionalOperator_2.TheNumberOfEqualsOutOfThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println(3);
        } else if (a == b || b == c ||  c == a ) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
