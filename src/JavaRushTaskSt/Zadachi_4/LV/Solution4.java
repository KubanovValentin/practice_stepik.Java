package JavaRushTaskSt.Zadachi_4.LV;
/*
Используя вложенные циклы while (цикл в цикле)
выведи на экран незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
 */
public class Solution4 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int n = 0;
            while (n < 20) {
                if ((i > 0 && i < 9) && (n > 0 && n < 19)) {
                    System.out.print(" ");
                } else {
                    System.out.print("Б");
                }
                n++;
            }
            System.out.println();
            i++;
        }

    }
}
