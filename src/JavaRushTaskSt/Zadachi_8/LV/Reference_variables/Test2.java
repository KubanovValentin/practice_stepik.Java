package JavaRushTaskSt.Zadachi_8.LV.Reference_variables;

import java.lang.reflect.Array;
import java.util.Arrays;

//Передача ссылок в методы
public class Test2 {
    public static void fill(String[] array, String value)
    {
        for (int i = 0; i < array.length; i++)
            array[i] = value;

    }

    public static void main(String[] args) {
        String[] data = new String[10];
        fill(data, "Hello");

    }
}
