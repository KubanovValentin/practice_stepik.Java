package JavaRushTaskSt.Zadachi_9.LV.Pauses_in_the_program;
/*
В классе Solution в методе countDown() происходит обратный отсчет. Тебе нужно сделать так,
чтобы между выводом текста в консоль была пауза в 1 секунду.
В этом тебе поможет метод sleep(long) класса Thread.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        countDown();

    }
    public static void countDown() throws InterruptedException {

        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Старт!");
    }
}
