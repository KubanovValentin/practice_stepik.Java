package JavaRushTask.Zadachi_4.LV;
/*
Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
Каждое значение нужно выводить с новой строки.
 */
public class Solution10 {
    public static void main(String[] args) {
        for (int x=1;x<=15;x++){
            if (x%2==0){
                System.out.println(x);
            }
        }
    }
}
