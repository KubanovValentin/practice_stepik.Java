package JavaRushTaskSt.Zadachi_13.LV.Wrapper_Types;

public class Solution7 {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        java.lang.Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }

    public static java.lang.Boolean isLess(int first, int second) {
        return first < second ;
    }
}
