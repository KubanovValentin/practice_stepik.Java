package ProgrammingWorkshop.ConditionalOperator_1.ChessMovesOfPieces.Horse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        if (x2-x1==2&&y2-y1==1
                ||x2-x1==2&&y1-y2==1
                ||x2-x1==1&&y2-y1==2
                ||x1-x2==1&&y2-y1==2
                ||x1-x2==2&&y2-y1==1
                ||x1-x2==2&&y1-y2==1
                ||x2-x1==1&&y1-y2==2
                ||x1-x2==1&&y1-y2==2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
