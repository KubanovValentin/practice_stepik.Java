package JavaRushTask.Zadachi_4.LV;
/*
Вернемся к нашему примеру с пропуском чисел, которые делятся на 2.
только не четные
 */
public class Test1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
        {
            if ( (i % 2) == 0) continue;
            System.out.println(i);
        }
    }
}
