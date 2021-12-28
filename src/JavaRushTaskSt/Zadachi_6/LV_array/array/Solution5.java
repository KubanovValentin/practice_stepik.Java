package JavaRushTaskSt.Zadachi_6.LV_array.array;
/*
Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
 */
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        if (n%2!=0){
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
        }else {
            for (int i = n-1; i >= 0; i--) {
               System.out.println(array[i]);
            }
        }
    }
}
