package JavaRushTask.Zadachi_4.LV;
/*
Программа должна считывать целые числа с клавиатуры до тех пор,
пока не будет введено что-то другое: например, строка или символ.
Выведи на экран максимальное четное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
 */
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {

        /* неверное - Если среди введенных символов нет четного числа или введен только один не числовой символ,
        то вывести на экран минимальное значение числа типа int.


        Scanner sc=new Scanner(System.in);
        int maxEven= -2147483647;

        while (sc.hasNextInt()){
            int x=sc.nextInt();

            if (x%2==0){
                int even=x;
                if (maxEven<even){
                    maxEven=even;
                }
            }
        }
        System.out.println(maxEven);
         */
//-----------------------------

        Scanner console = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
