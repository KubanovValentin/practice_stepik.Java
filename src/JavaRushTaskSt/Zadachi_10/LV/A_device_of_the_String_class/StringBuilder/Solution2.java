package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.StringBuilder;
/*
Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.
 */
public class Solution2 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        String result = builder.toString();
        return result;
    }
}
