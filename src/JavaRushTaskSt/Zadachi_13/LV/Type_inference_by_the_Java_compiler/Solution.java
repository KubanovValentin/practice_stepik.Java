package JavaRushTaskSt.Zadachi_13.LV.Type_inference_by_the_Java_compiler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В классе Solution есть поля number, string и метод main с объявленными в нем переменными.
Тебе нужно заменить объявления переменных на var, где это возможно. Порядок следования переменных не должен меняться.

Пример:
Scanner console = new Scanner(System.in);
Заменить на:
var console = new Scanner(System.in);

Требования:
•	Замени типы переменных на var, где это возможно.
•	Не изменяй правую часть выражений.
public class Solution {

 */
public class Solution {
//    private int number = 54;
//    private String string = "string";
//
//    public static void main(String[] args) {
//        int integer = 22;
//        String string = "string";
//        int[] array = new int[5];
//        ArrayList<String> strings = new ArrayList<String>();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Integer maxValue = Integer.valueOf(Integer.MAX_VALUE);
//    }

    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
        var integer = 22;
        var string = "string";
        var array = new int[5];
        var strings = new ArrayList<String>();
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }
}
