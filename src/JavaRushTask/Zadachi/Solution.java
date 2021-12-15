package JavaRushTask.Zadachi;
/*
В переменную hugeAmount нужно записать число 100500.
Используй переменные bigAmount, greatAmount и преобразование строки в число.
Для объявления и инициализации hugeAmount используй одну команду.
 */


public class Solution {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt(bigAmount)+Integer.parseInt(greatAmount); //напишите тут ваш код

        System.out.println(hugeAmount);
    }
}
