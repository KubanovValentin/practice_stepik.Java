package JavaRushTaskSt.Zadachi_4.LV;

import java.util.Scanner;

/*
Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Слово "enough" выводить не нужно.
Для этого необходимо использовать бесконечный цикл (while(true)).
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            String s = sc.nextLine();
            if (s.equals("enough")){
                break;}
            System.out.println(s);
        }

    }
}
