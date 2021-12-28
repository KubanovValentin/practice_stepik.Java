package JavaRushTaskSt.Zadachi_6.LV_array.array;
/*
Создаем объект-массив на 10 элементов
Цикл от 0 до 9 включительно
В ячейки заносим значения от 1 до 10
 */

public class Test2 {
    //Заполнение массива из 10 чисел числами от 1 до 10:
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
}
