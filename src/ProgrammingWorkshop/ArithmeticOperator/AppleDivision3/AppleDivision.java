package ProgrammingWorkshop.ArithmeticOperator.AppleDivision3;
import java.util.Scanner;
public class AppleDivision {
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();


        int rez= k%n;
        if (rez==0){
            System.out.println(0);
        }else {
            System.out.println(n-rez);
        }

    }
}