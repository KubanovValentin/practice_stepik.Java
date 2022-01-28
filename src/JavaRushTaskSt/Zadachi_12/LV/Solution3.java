package JavaRushTaskSt.Zadachi_12.LV;
/*
В программе массив заполняется числами от 0 до 9 и выводится на экран. Но из-за ошибки программа не компилируется.
Сделай так, чтобы программа компилировалась и работала правильно.

Требования:
•	Исправь ошибку, что бы программа работала корректно.
 */
import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
