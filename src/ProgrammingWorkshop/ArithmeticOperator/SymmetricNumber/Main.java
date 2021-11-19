package ProgrammingWorkshop.ArithmeticOperator.SymmetricNumber;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z = a%10;
        int x=a/10%10;
        int y = a/100%10;
        int w = a/1000%10;

        if (w==z&&y==x){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
