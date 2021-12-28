package JavaRushTaskSt.Zadachi_6.LV_array.array;
/*
Создаем объект Scanner
Создаем объект-массив на 10 элементов
Цикл от 0 до 9 включительно
Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
 */
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
    }
}
