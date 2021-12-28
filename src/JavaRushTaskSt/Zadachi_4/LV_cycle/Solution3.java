package JavaRushTaskSt.Zadachi_4.LV_cycle;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
заполненный буквой 'Q'.
 */
public class Solution3 {
    public static void main(String[] args) {
       int i=0;
        while (i<5){
            int n=0;
            while (n<10){
                System.out.print("Q");
                n++;
            }
            System.out.println();
            i++;
        }
    }
}
