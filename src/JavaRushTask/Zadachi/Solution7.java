package JavaRushTask.Zadachi;

import java.util.Scanner;

/*
Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
то вывести надпись "Имя, явитесь в военкомат",
где Имя - это имя, введенное ранее с клавиатуры.
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int year=sc.nextInt();
        String militaryCommissar = ", явитесь в военкомат";
        if (year>=18&&year<=28){
            System.out.println(name+militaryCommissar);
        }
        sc.close();
    }

}
