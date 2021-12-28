package JavaRushTaskSt.Zadachi_6.LV_array.Arrays_fill_method;
/*
Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
Если длина массива нечётная, то большую часть заполнить значениями valueStart, меньшую — valueEnd.
 Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса Solution будут разными, учти это.
 */
import java.util.Arrays;

public class Solution {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = valueEnd;
//        }
//        if (array.length%2==0){
//            Arrays.fill(array,0,array.length/2,valueStart);
//
//        }else if (array.length%3==0){
//            Arrays.fill(array,0,array.length/2+1,valueStart);
//        }
//        System.out.println(Arrays.toString(array));
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
