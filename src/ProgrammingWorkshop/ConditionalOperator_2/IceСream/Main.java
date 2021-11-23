package ProgrammingWorkshop.ConditionalOperator_2.IceСream;
//не решенная
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=3;
        int b=5;
        int k= sc.nextInt();

        if (k%a==0||k%b==0||k%a%b==0||k%b%a==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
//        if (k%3==0||
//                k%5==0||
//                (k >= 6 && (k - 6) % 5 == 0)||
//                (k >= 9 && (k - 9) % 5 == 0)||
//                (k >= 12 && (k - 12) % 5 == 0)){
//            System.out.println("YES");
//        }else if(k==4&&k<3){
//            System.out.println("NO");
//        }else {
//            System.out.println("NO");
//        }
    }
}
