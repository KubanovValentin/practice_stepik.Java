package JavaRushTaskSt.Zadachi_6.LV_array.array;

import java.util.Scanner;

/*
Создаем объект Scanner
Создаем объект-массив на 10 элементов
Цикл от 0 до 9

Читаем строку с клавиатуры и сохраняем ее в очередную ячейку массива
Цикл от 9 до 0

Выводим на экран очередную ячейку массива
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = sc.nextLine();
        }
        for (int i = 9; i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
