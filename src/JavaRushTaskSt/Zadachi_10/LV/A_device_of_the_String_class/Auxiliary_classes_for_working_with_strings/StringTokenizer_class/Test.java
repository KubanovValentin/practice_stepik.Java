package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.Auxiliary_classes_for_working_with_strings.StringTokenizer_class;

import java.util.Arrays;

public class Test {
    //Метод split()
    //Первый способ разбить строку на несколько частей — использовать метод split()
    public static void main(String[] args) {
        String str = "Good news everyone!";//Результатом будет массив из трех строк:
        String[] strings = str.split("ne");//["Good ", "ws everyo", "!"]
        System.out.println(Arrays.toString(strings));
    }
}
