package JavaRushTaskSt.Zadachi_7.LV_methods.Function_Parameters;

public class Test2 {
   // Метод printArraySum считает сумму чисел переданного массива и выводит ее на экран
    public static void printArraySum(int[] data)
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++)
            sum = sum + data[i];
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30};
        int[]year={123, 345,23,656,7676};
        int[]number={12,45,764,9,0,124,56};
        printArraySum(months);
        printArraySum(year);
        printArraySum(number);
    }
}
