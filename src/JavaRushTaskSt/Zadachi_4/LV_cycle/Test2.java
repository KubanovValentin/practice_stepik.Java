package JavaRushTaskSt.Zadachi_4.LV_cycle;

import java.util.Scanner;

/*
Создаем объект Scanner для чтения данных с консоли.
В переменной count будем хранить количество чисел.
Цикл от 0 до 10 (не включая 10).

Если в консоли ввели число,
то увеличиваем count на единицу.
Считываем строчку из консоли и никуда ее не сохраняем.

Выводим подсчитанную сумму на экран.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            if (console.hasNextInt())
                count++;
            console.nextLine();
        }
        System.out.println(count);
    }
}
/*
Если в строке есть несколько слов, разделенных пробелами,
и первое из них — число, метод hasNextInt() вернет true,
даже если остальные слова будут не числами.
Поэтому наша программа будет правильно работать,
только если в каждой строке написано не больше одного «слова».
 */