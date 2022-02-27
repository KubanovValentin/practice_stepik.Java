package Zaur_OOP.podpaket_lesson19;
//с помощью методов(например-append) мы можем менять значение sb, но не сам объект
public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("by by");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array = {sb1, sb2, sb3};
        for (StringBuilder sb : array) {
            sb.append(" Java");
 //           System.out.print(sb + "   ");
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]+"  ");
        }
    }
}
