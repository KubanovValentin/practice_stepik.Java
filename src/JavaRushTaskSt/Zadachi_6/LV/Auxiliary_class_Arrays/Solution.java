package JavaRushTaskSt.Zadachi_6.LV.Auxiliary_class_Arrays;
import java.util.Arrays;
/*
Реализуй метод main(String[]),
 который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().
 */
public class Solution {
    //метод Arrays.toString()
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //напишите тут ваш код

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
