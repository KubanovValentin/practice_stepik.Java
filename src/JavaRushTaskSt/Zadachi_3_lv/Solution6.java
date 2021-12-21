package JavaRushTaskSt.Zadachi_3_lv;
/*
Ввести с клавиатуры температуру на улице.
Если температура меньше 0,
вывести надпись "на улице холодно",
иначе - вывести надпись "на улице тепло".
 */
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        if (t<0){
            System.out.println(cold);
        }else {
            System.out.println(warm);
        }
    }
}
