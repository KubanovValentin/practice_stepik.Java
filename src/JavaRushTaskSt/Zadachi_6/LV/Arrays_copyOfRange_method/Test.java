package JavaRushTaskSt.Zadachi_6.LV.Arrays_copyOfRange_method;

import java.util.Arrays;

// Метод Arrays.copyOfRange    тип[] имя2 = Arrays.copyOfRange(имя, первый, последний);
public class Test {
    public static void main(String[] args) {
        int[] x = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] x2 = Arrays.copyOfRange(x, 5, 10);
        String str2 = Arrays.toString(x2);//Переменная str2 содержит значение:"[16, 17, 18, 19, 20]"

        int[] x3 = Arrays.copyOfRange(x, 5, 15);
        String str3 = Arrays.toString(x3);//Переменная str3 содержит значение:"[16, 17, 18, 19, 20, 0, 0, 0, 0, 0]"
    }
}
