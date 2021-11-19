package ProgrammingWorkshop.ArithmeticOperator.Snail;
//не решенная
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x;
        for ( x=0;x<=h;x+=a){
            x-=b;
        }
        System.out.println(x);
    }
}
