package JavaRushTaskSt.Zadachi_6.LV.Auxiliary_class_Arrays;

import java.util.Arrays;

//Метод Arrays.equals()
public class Test2 {
    public static void main(String[] args) {
        //Arrays.equals(имя1, имя2)
        int[] x1 = {1, 2, 3};
        int[] x2 = {1, 2, 3};
        x1.equals(x2);
//        -------------
        int[] x3 = {1, 2, 3};
        int[] x4 = {1, 2, 3};
        Arrays.equals(x3, x4);
//        --------------------
        int[] x5 = {1, 2, 3};
        int[] x6 = {1, 2, 3, 4};
        Arrays.equals(x5, x6);
    }
}
