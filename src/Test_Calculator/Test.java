package Test_Calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("vvod");
            int x= sc.nextInt();
            if (x>10&&x<20){
                System.out.println("hi");
            }else {
                System.out.println("no");
            }
        }

    }
}
