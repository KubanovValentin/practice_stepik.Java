package JavaRushTaskSt.Zadachi_4.LV;
/*
Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Пример вывода на экран для имени Света:
 */
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        int count=1;
        while (count<=10){
            System.out.println(name+text);
            count++;
        }
    }
}
