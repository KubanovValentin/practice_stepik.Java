package AlishevCourse.Day3.Zadachi;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        while (count<5){
            //считываем с консоли делимое и делитель(ввод с консоли)
            double a= sc.nextDouble();
            double b= sc.nextDouble();

            count++;

            if (b==0){
                System.out.println("деление на 0");
                continue;
            }
            System.out.println(a/b);
        }
    }
}
