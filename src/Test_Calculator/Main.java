package Test_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char zn = sc.next().charAt(0);
        int b = sc.nextInt();
        Operations operat = new Operations();
        if (a < 10 && a > 0 && b < 10 && b > 0) {
            operat.a = a;
            operat.b = b;
            operat.zn = zn;
            operat.plus = '+';
            operat.min = '-';
            operat.del = '/';
            operat.umn = '*';

            operat.matemOperat();
        } else {
            System.out.println("некорректный ввод данных");
        }

    }
}
