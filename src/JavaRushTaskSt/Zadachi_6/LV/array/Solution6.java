package JavaRushTaskSt.Zadachi_6.LV.array;
/*
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
 */
import java.util.Scanner;

public class Solution6 {
    public static int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
