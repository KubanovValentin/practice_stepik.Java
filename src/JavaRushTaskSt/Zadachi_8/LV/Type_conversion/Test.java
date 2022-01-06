package JavaRushTaskSt.Zadachi_8.LV.Type_conversion;

public class Test {
    /*
    =============================================================================
    Расширение типов

    byte	1 байт
    short	2 байта
    int	4 байта
    long	8 байт


    float	4 байта
    double	8 байт
--------------------------------------
    Этот код отлично скомпилируется.
    byte a = 5;
    short b = a;
    int c = a + b;
    long d = c * c;

-------------------------------------
long a = 1234567890;
float b = a;
double c = a;

b == 1.23456794E9
c == 1.23456789E9
==============================================================
    Сужение типов
Каждый раз нужно явно указывать оператор преобразования типа

    long a = 1;
    int b = (int) a;
    short c = (short) b;
    byte d = (byte) c;

    long a = 1000000;     a == 1000000
    int b = (int) a;      b == 1000000
    short c = (short) b;  c == 16960
    byte d = (byte) c;    d == 64


   -------------------------------------------------------
    byte a = 1;
    byte b = 2;
    byte c = (byte) a * b; Оператор приведения типа будет применен только к переменной a, которая и так имеет тип byte.
                            Код не скомпилируется.

    byte a = 1;
    byte b = 2;
    byte c = (byte) (a * b); Вот так правильно.



     */
}
