package JavaRushTaskSt.Zadachi_6.LV.Auxiliary_class_Arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};//Переменная str будет содержать строковое значение: "[1, 2, 3]"
        String str = Arrays.toString(array);
//        System.out.println(str);
        int[] array1 = {};//Переменная str1 будет содержать строковое значение: "[]"
        String str1 = Arrays.toString(array1);
//        System.out.println(str1);
        String[] array2 = {"Привет", "Как", "Дела"};//Переменная str2 будет содержать строковое значение:"[Привет, Как, Дела]"
        String str2 = Arrays.toString(array2);
//        System.out.println(str2);
    }
}
