package JavaRushTaskSt.Zadachi_6.LV_array.Arrays_sort_method;

import java.util.Arrays;

//Метод Arrays.sort()  Arrays.sort(имя);
public class Test {
    public static void main(String[] args) {
        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};    //Переменная str содержит значение:
                                                                // "[-20, -20, -20, -2, 0, 3, 8, 11, 99, 999]"

        Arrays.sort(x);
        String str = Arrays.toString(x);
//        ---------------------------------------------------
//         Arrays.sort(имя, первый, последний);

        int[] x1 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};//Переменная str содержит значение:
                                                            //"[11, -2, 3, 0, -20, -20, 8, 999, 99, -20]"
        Arrays.sort(x1, 4, 8);
        String str1 = Arrays.toString(x1);
    }
}
