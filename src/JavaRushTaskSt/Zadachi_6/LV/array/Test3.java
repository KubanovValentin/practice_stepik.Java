package JavaRushTaskSt.Zadachi_6.LV.array;
/*
Создаем объект-массив на 10 элементов
Цикл от 0 до 9 включительно
В ячейки заносим значения от 10 до 1
 */
public class Test3 {
    //Заполнение массива из 10 чисел числами от 10 до 1:
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 10 - i;
            System.out.println(array[i]);
        }
    }
}
