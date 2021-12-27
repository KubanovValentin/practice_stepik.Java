package JavaRushTaskSt.Zadachi_6.LV.Arrays_fill_method;

import java.util.Arrays;

//Метод Arrays.fill()
public class Test {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//Заполняем ячейки x[3], x[4], x[5], x[6] значениями 999.
                                                  //Нумерация ячеек массива с нуля!
        Arrays.fill(x, 3, 7, 999);

        String str = Arrays.toString(x);//Переменная str содержит значение:"[1, 2, 3, 999, 999, 999, 999, 8, 9, 10]"
    }
}
/*
Метод Arrays.fill() работает только с одномерными массивами.
Если в него передать двумерный массив, он будет обработан как одномерный, со всеми вытекающими последствиями.
 */