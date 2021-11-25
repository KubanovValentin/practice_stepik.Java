package AlishevCourse.Day1.Zadachi;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //мое
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " x " + k + " = " + i * k);
        }

    }
}
