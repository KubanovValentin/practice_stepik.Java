package JavaRushTaskSt.Zadachi_9.LV.Bitwise_operations;
/*
Закомментируй ненужные строки кода, чтобы на экран вывелась цифра 5.
Примечание: нужно закомментировать только две строки.


 */
public class Solution {
    public static void main(String[] args) {
        int x = 7;
//       x = x & 25;
          x = x & 5;
//        x = x & 3;
      x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}
