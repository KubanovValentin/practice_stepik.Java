package JavaRushTaskSt.Zadachi_6.LV_array.Arrays_binarySearch_method;

import java.util.Arrays;

// Метод Arrays.binarySearch()  int index = Arrays.binarySearch(имя, значение);
public class Test {
    public static void main(String[] args) {
        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        int index1 = Arrays.binarySearch(x, 0);
        int index2 = Arrays.binarySearch(x, -20);
        int index3 = Arrays.binarySearch(x, 99);
        int index4 = Arrays.binarySearch(x, 5);
        int index5 = Arrays.binarySearch(x, 1);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
    }
}
