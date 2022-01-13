package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class;

import java.util.Scanner;

//Решение 2 — использование методов split() и join():
public class Test3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//  Создание объекта Scanner
        String path = console.nextLine();//   Чтение строки с консоли

        String[] array = path.split("/");//  Преобразование строки в массив строк.
                                                //  В качестве разделителя используется символ /
                                                 //  (дополнительные два слеша – это следствие двойного экранирования).


        String result = String.join("\\", array);//  Объединяем все строки из массива строк, в качестве разделителя
                                                        //   используется символ \ (мы видим его экранированным).

        System.out.println(result);//Выводим строку на экран.
    }
}
