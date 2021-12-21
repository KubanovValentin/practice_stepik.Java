package JavaRushTaskSt.Zadachi_4.LV;
/*
Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»
 */
public class Solution {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        //напишите тут ваш код
        int count=1;

        while (count<=100){
            System.out.println(count+"."+quote);
            count++;
        }
    }
}
