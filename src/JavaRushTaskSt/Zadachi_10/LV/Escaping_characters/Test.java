package JavaRushTaskSt.Zadachi_10.LV.Escaping_characters;

public class Test {
}
/*
Способ есть, ему даже дали название — экранирование символов. Вы просто пишете внутри строки текста кавычки,
а перед кавычками добавляете символ \ (обратная косая черта или обратный слеш или бекслеш, от англ. backslash).

        String s = "Фильм \"Друзья\" номинирован на \"Оскар\"";

        char c = '\"';      \" — это один символ, а не два

        char c = '"';          так тоже можно: двойная кавычка внутри одинарных кавычек

        \n    перенос строки
        System.out.println("С уважением,\nАноним");
----------------------------------------------------------------------------------------------

        \t    Вставить символ табуляции
        \b    Вставить символ возврата на один символ
        \n    Вставить символ новой строки
        \r    Вставить символ возврата каретки
        \f    Вставить символ прогона страницы
        \'    Вставить одинарную кавычку
        \"    Вставить двойную кавычку
        \\    Вставить обратный слеш

----------------------------------------------------------------------------------------------
Символ табуляции – \t


System.out.println("0\t1\t2\t3");
System.out.println("0\t10\t20\t30");
System.out.println("0\t100\t200\t300");

0       1        2        3
0       10       20       30
0       100      200      300


---------------------------------------------------------------------------------------------
Возврат на один символ назад – \b

System.out.println("Привет\b\b Мир");
Прив Мир!

---------------------------------------------------------------------------------------------
Символ возврата каретки – \r

System.out.println("Привет\rМир!");
Мир!

----------------------------------------------------------------------------------------------
Символ прогона страницы – \f

Сейчас бы мы назвали его разрыв страницы или новая страница.

----------------------------------------------------------------------------------------------
Обратный слэш – \\

System.out.println("c:\\projects\\my\\first");


Вот так правильно!




 */