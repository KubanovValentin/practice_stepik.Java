package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class;

import java.util.Scanner;
//Решение 1 — использование массива char’ов
public class Test2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//Создание объекта Scanner
        String path = console.nextLine();//Чтение строки с консоли

        char[] chars = path.toCharArray();//Преобразование строки в массив символов
        for (int i = 0; i < chars.length; i++)//Цикл по символам
            if (chars[i] == '/')//Если символ равен /,
                chars[i] = '\\';//заменить его на \. Не забываем про экранирование.

        String result = new String(chars);//Создаем новую строку на основе массива символов.
        System.out.println(result);//Выводим строку на экран.
    }
}
