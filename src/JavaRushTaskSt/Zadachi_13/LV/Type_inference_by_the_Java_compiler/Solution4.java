package JavaRushTaskSt.Zadachi_13.LV.Type_inference_by_the_Java_compiler;

import java.util.ArrayList;

/*
В методе main создается список ArrayList<String>, присваивается переменной var strings и заполняется пятью элементами.
Нужно переписать код, не изменяя логику, используя двойные фигурные скобки.

Требования:
•	Список strings должен заполняться пятью элементами в двойных фигурных скобках.
 */
public class Solution4 {
    /*
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        strings.add("Так");
        strings.add("тоже");
        strings.add("можно");
        strings.add("делать");
        strings.add("!");
    }
     */
    public static void main(String[] args) {
        var strings = new ArrayList<String>(){{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};
    }

}
