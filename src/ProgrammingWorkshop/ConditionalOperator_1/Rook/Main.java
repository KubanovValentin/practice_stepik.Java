package ProgrammingWorkshop.ConditionalOperator_1.Rook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        if (x2==x1||y2==y1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
