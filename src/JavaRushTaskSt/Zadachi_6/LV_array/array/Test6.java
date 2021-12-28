package JavaRushTaskSt.Zadachi_6.LV_array.array;

import java.util.Scanner;

/*
Поиск минимального элемента в массиве.
Создаем объект Scanner
Создаем объект-массив на 10 элементов
цикл от 0 до 9 включительно
Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
В качестве минимального числа взяли нулевой элемент массива
Цикл от 1 до 9 включительно
Если текущий элемент массива меньше «найденного минимального числа»
то «обновить значение минимального числа»
Вывести найденное минимальное число на экран
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] < min)

                min = array[i];
        }
        System.out.println(min);
    }
}
