package JavaRushTaskSt.Zadachi_9.LV.Bitwise_operations;
/*
Внеси исправления в метод main(), чтобы он выводил в консоли число 20.
В методе можно изменять только постинкремент на преинкремент и наоборот, а также постдекремент на предекремент и наоборот.
 */
public class Solution7 {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}

