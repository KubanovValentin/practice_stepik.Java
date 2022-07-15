package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;
//1. Оператор throw
//------------------------------
/*
Вы всегда можете снова вбросить Java-машине исключение, которое только что перехватили.
Для этого нужно использовать оператор throw:

throw исключение;

* */
public class Test {
    public static void main(String[] args) {
        try
        {
            int d = 2/0;
        }
        catch(Exception except)
        {
            System.out.println("Перехватили исключение");
            throw except;
        }
    }
}
/*
В этом коде мы перехватили исключение, вывели на экран надпись об этом и снова выбросили его.
Повторно выброшенное исключение не может быть захвачено другими блоками catch этого же try-блока.
* */