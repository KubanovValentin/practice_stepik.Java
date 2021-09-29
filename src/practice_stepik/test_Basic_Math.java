package practice_stepik;
import java.math.BigInteger;
import java.util.Scanner;
public class test_Basic_Math {
    public static void main(String[] args) {
//-----------------------------
// Завершите программу таким образом,
// чтобы она вывела на печать фразу "In the loop" семь раз,
// каждый раз с новой строки.
//        int x = 1;
//        while (x <= 7) {
//            System.out.println("In the loop");
//            x++;;
//        }
//------------------------------------
// Исправьте программу таким образом, чтобы она вывела на печать фразу "Java rocks!"
//        int a = 144;
//        int b = 33;
//        if (a >= 10 && b <= 100) {
//            System.out.println("Java rocks!");
//        }
//--------------------------------------
// Выведите на печать натуральные числа от 1 до 5 по порядку,
// каждое число на новой строке.

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//        if (x <= n) {
//            while (x <= n){
//                if(x%2!=0){
//                    System.out.print(x +" ");
//                }
//                x++;
//            }
//        }else {
//            while (n <= x){
//                if(n%2!=0){
//                    System.out.print(n +" ");
//                }
//                n++;
//            }
//        }
//------------------------------------------
// На вход подаётся целое число. Выведите его максимальную цифру.
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a<0){ //делаем число положительным
//            a *=-1;
//        }
//        int m = a%10;
//        a=a/10;
//        while (a>0){
//            if(a%10>m){
//                m=a%10;
//            }a=a/10;
//        } System.out.print(m);

//----------------------------------------
// Выведите все нечётные целые числа, находящиеся между введёнными числами (включительно),
// в одной строке через пробел, в порядке возрастания.
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//        if (x <= n) {
//            while (x <= n){
//                if(x%2!=0){
//                    System.out.print(x +" ");
//                }
//                x++;
//            }
//        }else {
//            while (n <= x){
//                if(n%2!=0){
//                    System.out.print(n +" ");
//                }
//                n++;
//            }
//        }
//-----------------------------------------------------
// а вход подаётся натуральное число n.
// Определите, является ли это число простым.
// Выведите true, если число n - простое, и false - если нет.

//        ------------------гуглил.1 решение и оно не прошло т.к не проходит по 1
//        Scanner sc = new Scanner(System.in);
//        Integer integer = sc.nextInt();
//        BigInteger bigInteger = BigInteger.valueOf(integer);
//        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
//        System.out.println(probablePrime);
//        ---------------------------------------- 2 решение тоже не проходит
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n>1 && n<=5 && n%n==0){
//            System.out.println(true);
//        }
//        else if(n>0 && n%2!=0 && n%3!=0 && n!=1) {
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        -----------------------------------------3 решение не подошло
//            int n;
//            Scanner sc = new Scanner(System.in);
//            if (sc.hasNext()){
//                n = sc.nextInt();
//                for (int i = (int)Math.sqrt(n);i>=1;i-- ){
//                    if (n==2 || n==3) {
//                        System.out.println(true);
//                        break;
//                    }else if(n%i==0 && i!=1) {
//                        System.out.println(false);
//                        break;
//                    }else if (n==1){
//                        System.out.println(false);
//                        break;
//                    }
//                    else{
//                        System.out.println(true);
//                        break;
//                    }
//                }
//            }
//       --------------------------- 4 правильное решение!!!!

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = 0;
//        while(n>x){
//            if (n%2!=0 && n%3!=0 && n!=1||(n==2 || n==3)){
//                System.out.print(true);
//                break;
//            }else {
//                System.out.print(false);
//                break;
//            }
//
//        }

// -------------------------------------------------------------------
// На вход подаётся натуральное число n.
// Выведите на печать все его делители в одну строку через пробел.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while(n>=x){
            if(n%x==0){
                System.out.print(x + " ");
            }x++;
        }
    }
}

