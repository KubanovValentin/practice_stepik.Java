package JavaRushTaskSt.Zadachi_7.LV_methods.Access_Modifiers.Constants;

public class Test {
    public static void main(String[] args) {
        final int[] data = {1, 2, 3, 4, 5, 6};//Создаем массив.

       // data = {6, 7, 8, 9}; Так нельзя: переменная data объявлена как final.

        data[0] = 0;//А так можно.
        data[1] = 0;//И так можно.
        data[2] = 0;
    }
}
