package ProgrammingWorkshop.ConditionalOperator_1.Change;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e;//руб
        int f;//коп
        if (b > 100 || d > 100) {
            a += b / 100;
            c += d / 100;
            b = b % 100;
            d = d % 100;

            if (c >= a) {
                e = c - a;
                if (d >=b) {
                    f = d - b;
                    System.out.println(e + " " + f);
                }else if (d<b){
                    System.out.println("Денег недостаточно");
                }
            }
        } else if (b < 100 && d < 100) {
            if (c > a) {
                if (d >= b) {
                    e = c - a;
                    f = d - b;
                    System.out.println(e + " " + f);
                }else if (d<b){
                    c=c-1;
                    e = c - a;
                    f=(d+100)-b;
                    System.out.println(e + " " + f);
                }
            }else if(c==a){
                if (d >= b) {
                    e = c - a;
                    f = d - b;
                    System.out.println(e + " " + f);
                }else if (d<b){
                    System.out.println("Денег недостаточно");
                }
            }
        }


    }
}
