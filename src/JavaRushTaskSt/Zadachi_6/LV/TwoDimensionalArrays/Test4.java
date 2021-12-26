package JavaRushTaskSt.Zadachi_6.LV.TwoDimensionalArrays;
//Работа с двумерным массивом
public class Test4 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];//Создание массива
        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};//Заполнение массива значениями
        matrix[1] = new int[]{1, 2, 3};//Заполнение массива значениями
        matrix[2] = new int[]{1};//Заполнение массива значениями
        for (int i = 0; i < matrix.length; i++) {//Внешний цикл по строкам массива — перебирает строки массива.
            for (int j = 0; j < matrix[i].length; j++)//Внутренний цикл по ячейкам — перебирает ячейки одной строки.
                System.out.print( matrix[i][j] + " " );//
            System.out.println();//
        }
    }
}
