package JavaRushTaskSt.Zadachi_6.LV_array.MultidimensionalArrays;
//Давайте ради интереса создадим многомерный массив размерности 4. int[][][][] matrix = new int[2][3][4][5];
public class Test {
    public static void main(String[] args) {
        int[][][][] matrix;
        matrix = new int[2][][][];                // создаем массив «ссылок на ссылки на ссылки» длины 2
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i] = new int[3][][];             // создаем массив «ссылок на ссылки» длины 3
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = new int[4][];          // создаем массив ссылок длины 4
                for (int k = 0; k < matrix[i][j].length; k++)
                    matrix[i][j][k] = new int[5];       // создаем массивы целых чисел длины 5
            }
        }
    }
}
