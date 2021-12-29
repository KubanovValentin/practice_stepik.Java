package JavaRushTaskSt.Zadachi_7.LV_methods.Function_Parameters;

public class Test3 {

 //   Метод fill проходится по всем ячейкам переданного двумерного массива и присваивает им значение value.

    public static void fill(int[][] data, int value)
    {
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
                data[i][j] = value;
        }
    }

    public static void main(String[] args)
    {
        //Создаем двумерный массив.
        //Заполняем весь массив числом 8.
        int[][] months = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
        fill (months, 8);
    }
}
