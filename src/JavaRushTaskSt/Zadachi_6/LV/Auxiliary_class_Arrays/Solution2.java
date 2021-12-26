package JavaRushTaskSt.Zadachi_6.LV.Auxiliary_class_Arrays;
/*
Реализуй метод main(String[]),
который выводит массивы strings и ints в консоли c помощью метода Arrays.deepToString(Object[][]).
 */
import java.util.Arrays;
// метод Arrays.deepToString()
public class Solution2 {
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
