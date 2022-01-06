package JavaRushTaskSt.Zadachi_8.LV.Type_conversion;
/*
Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.
Изменять типы переменных a, b, c и d нельзя.
 */
public class Solution2 {
    long a = 109 + 15;
    int b = (int) (a * 2);
    short c = (short)(a / b);
    byte d =(byte) (a + b - c);
}
