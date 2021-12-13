package AlishevCourse.Day10.Exceptions_Part2_Throwing_exceptions.Exceptions2;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(sc.nextLine());

            if (x!=0){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("error!!!не то что надо");
                }
            }
        }
    }
}
