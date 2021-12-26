package JavaRushTaskSt.Zadachi_6.LV.TwoDimensionalArrays;
/*
Двумерный массив

Нулевая строка — массив из 10 элементов
Первая строка — массив из 50 элементов.

Кстати, как узнать длину «контейнера контейнеров» в нашем примере?
Это ведь тоже объект-массив, а значит, у него есть длина. Правильный ответ — matrix.length.

А у массивов-строк как? matrix[0].length
 */
public class Test3 {
    public static void main(String[] args) {
        // Важная матрица с данными
        int[][] matrix = new int[2][];
        matrix[0] = new int[10];
        matrix[1] = new int[50];
    }
}
