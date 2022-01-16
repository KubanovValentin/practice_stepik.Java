package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.Auxiliary_classes_for_working_with_strings.StringTokenizer_class;

import java.util.StringTokenizer;

public class Test1 {
    //Класс StringTokenizer
    //специальный класс, вся работа которого — разделять строку на подстроки.
    //Класс состоит из конструктора и двух основных методов.
    //В конструктор нужно передать строку, которую мы разбиваем на части, и строку — набор символов, используемых для разделения.
//    --------------------
    //Метод        String nextToken()-->Возвращает следующую подстроку
    //Метод        boolean hasMoreTokens()-->Проверяет, есть ли еще подстроки.


    //Этот класс чем-то напоминает класс Scanner, у которого тоже были методы nextLine() и hasNextLine().

    //Создать объект StringTokenizer можно командой:
//----------------

    //StringTokenizer имя = new StringTokenizer(строка, разделители);

    //---------------
    public static void main(String[] args) {
        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
