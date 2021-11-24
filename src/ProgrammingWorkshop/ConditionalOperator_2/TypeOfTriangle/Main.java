package ProgrammingWorkshop.ConditionalOperator_2.TypeOfTriangle;
//не решенная
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if ((a==0||b==0||c==0)) {
            System.out.println("impossible");
        } else if ((a * a) + (b * b) == (c * c)||(a * a) + (c * c) == (b * b)||(b * b) + (c * c) == (a * a)) {
            System.out.println("right");
        } else if ((a * a) + (b * b) > (c * c)||(c * c) + (b * b) > (a * a)||(a * a) + (c * c) > (b * b)) {
            System.out.println("acute");
        } else if ((a * a) + (b * b) < (c * c)||(c * c) + (b * b) < (a * a)||(c * c) + (a * a) < (b * b)) {
            System.out.println("obtuse");
        }else if ((a>b+c) || (b>a+c) || (c>a+b)){
            System.out.println("impossible");
        }
    }
}
