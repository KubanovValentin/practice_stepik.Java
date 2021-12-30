package JavaRushTaskSt.Zadachi_7.LV_methods.Return_statement;

/*
Метод fill заполняет часть переданного массива значением value.
Часть массива определяется индексами from и to.
Если from меньше 0 или to больше длины массива, метод тут же завершается.
 */

public class Test {
    public static void fill(int[] data, int from, int to, int value) {

        if (from < 0 || to > data.length)
            return;

        for (int i = from; i < to; i++) {
            data[i] = value;
        }
    }

    public static void main(String[] args) {
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        fill(months, 2, 10, 8);
    }
}
