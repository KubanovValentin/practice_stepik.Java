package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.Creating_substrings;
//Вот список из 8 методов получения подстрок из текущей строки:
public class Test {
    /*
String substring(int beginIndex, int endIndex)
Возвращает подстроку, заданную интервалом символов beginIndex..endIndex.


String repeat(int count)
Повторяет текущую строку n раз


String replace(char oldChar, char newChar)
Возвращает новую строку: заменяет символ oldChar на символ newChar


String replaceFirst(String regex, String replacement)
Заменяет в текущей строке подстроку, заданную регулярным выражением.


String replaceAll(String regex, String replacement)
Заменяет в текущей строке все подстроки, совпадающие с регулярным выражением.


String toLowerCase()
Преобразует строку к нижнему регистру


String toUpperCase()
Преобразует строку к верхнему регистру


String trim()
Удаляет все пробелы в начале и конце строки
     */
//-----------------------------------------------------------------------------------------------------------
    //Метод substring(int beginIndex, int endIndex)
    /*
    "Привет".substring(0, 3);
    "При"
    "Привет".substring(1, 4);
    "рив"
    "Привет".substring(1, 6);
    "ривет"
    "Привет".substring(1);
    "ривет"


    Если параметр endIndex не указывается (а так можно), подстрока берется от символа beginIndex и до конца строки.
     */


//-----------------------------------------------------------------------------------------------------------
/*
Метод repeat(int n)
Метод repeat просто повторяет текущую строку n раз. Пример:

"Привет".repeat(3);
"ПриветПриветПривет"
"Привет".repeat(2);
"ПриветПривет"
"Привет".repeat(1);
"Привет"
"Привет".repeat(0);
""
 */


//-----------------------------------------------------------------------------------------------------------
/*
   Метод replace(char oldChar, char newChar)

Метод replace() возвращает новую строку, в которой все символы oldChar заменены на символ newChar.
 Длина строки при этом не меняется. Пример:


    Привет".replace('Я', 'я');
    "Привет"
    "Привет".replace('т', 'д');
    "Привед"
    "Привет".replace('и', 'е');
    "Превет"
    "Привет".replace('и', 'ы');
    "Прывет"
 */

//-----------------------------------------------------------------------------------------------------------
/*
Методы replaceFirst() и replaceAll()

Метод replaceAll() заменяет все вхождения одной подстроки на другую. Метод replaceFirst()
заменяет первое вхождение переданной подстроки на заданную подстроку.
Строка, которую заменяют, задается регулярным выражением.
Разбирать регулярные выражения мы будем в квесте Java Multithreading.

"Good news everyone!".replaceAll("e.", "EX");
"Good nEXs EXEXyonEX"
"Good news everyone!".replaceAll("o.", "-o-");
"G-o-d news every-o-e!"
"Good news everyone!".replaceFirst("e.", "EX");
"Good nEXs everyone!"
"Good news everyone!".replaceFirst("o.", "-o-");
"G-o-d news everyone!"

 */

//-----------------------------------------------------------------------------------------------------------
/*
Методы toLowerCase() и toUpperCase()
С этими методами мы познакомились, когда только в первый раз учились вызывать методы класса String.
Метод trim()
Метод trim() удаляет у строки пробелы с начала и с конца строки. Пробелы внутри строки никто не трогает. Примеры:


"     ".trim();  -->""

"Привет".trim();-->"Привет"

" Привет\n как дела?\n   ".trim();-->"Привет\n как дела?\n"

"  Пароль\n   \n ".trim();-->"Пароль\n   \n"

 */
}
