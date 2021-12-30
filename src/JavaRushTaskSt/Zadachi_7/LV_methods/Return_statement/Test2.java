package JavaRushTaskSt.Zadachi_7.LV_methods.Return_statement;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //Метод abs() возвращает значение типа double
        int d1=5;
        int d2=15;
        double delta = Math.abs(d1 - d2);

//        -----------------------------------------------
        //Метод nextInt() возвращает значение типа int
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();


//        -----------------------------------------------
        //Метод toUpperCase() возвращает значение типа String
        String str = "Привет";
        String s2 = str.toUpperCase();


//        -----------------------------------------------
        //Метод copyOf() возвращает значение типа int[]
        int[] data = {1, 4, 5, 6, 7, 8, 11};
        int[] array = Arrays.copyOf(data, 4);




        //    Каждый метод может вернуть только одно значение и одного заранее заданного типа.
        //    Тип возвращаемого значения определяется при объявлении метода:
/*
                public static тип имя(параметры)
                        {
                        код метода
                            }
 */

    }
}
