package JavaRushTaskSt.Zadachi_6.LV_array.TwoDimensionalArrays;

public class Test2 {
    public static void main(String[] args) {
        // Важная матрица с данными
        // Двумерный массив
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
        };

        /*
        В matrix[0] у нас хранится ссылка на первую строку.
        Меняем ссылки местами.

        В итоге массив matrix выглядит так:
        {
          {5, 4, 3, 2, 1},
          {1, 2, 3, 4, 5}
        };
         */
        int[] tmp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = tmp;
    }
}
