package JavaRushTaskSt.Zadachi_6.LV.array;
/*
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
 */
import java.util.Scanner;

public class Solution7 {
    public static int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
