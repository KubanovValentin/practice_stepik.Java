package JavaRushTaskSt.Zadachi_9.LV.Pauses_in_the_program;
// Метод Thread.sleep()
public class Thread_sleep {
    /*
    Thread.sleep(2000);
    Приостановит программу на 2 секунды.

    Thread.sleep(500);
    Приостановит программу на полсекунды.

    Thread.sleep(60 * 60 * 1000);
    Приостановит программу на 1 час.
     */
    public static void main(String[] args) throws InterruptedException {
        //Программа будет выводить на экран каждую секунду числа 10, затем 9, затем 8 и т.д.
        //Когда счет дойдет до 0, программа выведет надпись Поехали.
        //Длительность одного витка цикла = 1000 / количество раз в секунду
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Поехали");
    }
    //длина паузы = длительность одного витка цикла — время выполнения действия
}
/*
Thread.sleep(миллисекунды, наносекунды);

Наносекунды — это 1 миллионная от миллисекунд. Поэтому пауза в полторы миллисекунды будет выглядеть так:
Thread.sleep(1, 500_000);


Ну а если вы хотите паузу в 1/10 миллисекунды, вам нужно будет написать так:
Thread.sleep(0, 100_000);
 */