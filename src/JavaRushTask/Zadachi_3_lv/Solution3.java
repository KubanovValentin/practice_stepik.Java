package JavaRushTask.Zadachi_3_lv;
/*
В методе main на экран выводятся три строки.
Внеси изменения в код, чтобы все буквы в этих строках стали заглавными.
 */
public class Solution3 {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        //напишите тут ваш код
//        System.out.println(usa);
//        System.out.println("Винни Пух");
//        System.out.println(caps + "they know I mean business");

        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
