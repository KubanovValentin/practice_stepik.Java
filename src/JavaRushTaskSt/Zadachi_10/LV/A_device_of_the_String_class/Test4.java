package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class;

import java.util.Scanner;

//Решение 3 — использование метода replace(char oldChar, char newChar):
public class Test4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);// Создание объекта Scanner
        String path = console.nextLine(); // Чтение строки с консоли

        String result = path.replace('/', '\\');// Просто заменяем один символ на второй
                                                                // (второй — экранирован)
        System.out.println(result); // Выводим строку на экран.
    }
}
