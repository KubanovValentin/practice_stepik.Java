package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.Working_with_strings;

import java.util.Scanner;

public class Test {
    /*
int indexOf(String str) --> Ищет строку str в текущей строке. Возвращает индекс первого символа встретившийся строки.

int indexOf(String str, int index)-->Ищет строку str в текущей строке, пропустив index первых символов.
                                     Возвращает индекс найденного вхождения.

int lastIndexOf(String str)-->Ищет строку str в текущей строке с конца. Возвращает индекс первого вхождения.

int lastIndexOf(String str, int index)-->Ищет строку str в текущей строке с конца, пропустив index первых символов.

boolean matches(String regex)-->Проверяет, что текущая строка совпадает с шаблоном, заданным регулярным выражением.
     */
    //-------------------------------------------------------------------------------------------


    //Допустим, у нас есть url типа такого: «https://domen.ru/about/reviews»,
    // и мы хотим заменить имя домена на javarush.ru.
    //Домены в урлах могут быть разными, но мы знаем, что:
    //Перед именем домена идут два слеша //
    //После имени домена идет одинарный слеш /
    //Вот как бы выглядел код такой программы:

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//Создание объекта Scanner
        String path = console.nextLine();//Чтение строки с консоли

        int index = path.indexOf("//");//Получаем индекс первого вхождения строки //
        int index2 = path.indexOf("/", index + 2);//Получаем индекс первого вхождения строки /, но ищем только
                                                                //после символов //.
        String first = path.substring(0, index + 2);//Получаем строку от начала и заканчивая символами //
        String last = path.substring(index2);//Получаем строку от / и до конца.

        String result = first + "javarush.ru" + last;//Склеиваем строки и новый домен.
        System.out.println(result);
    }
}
