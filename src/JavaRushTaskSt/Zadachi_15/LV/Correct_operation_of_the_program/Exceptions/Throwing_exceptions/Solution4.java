package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;
/*
Сделай так, чтобы программа компилировалась, не используя try-catch.

Требования:
•	В методе main не должно быть блока try-catch.
•	Метод main должен бросать исключение.
•	Метод main должен вызывать метод generateLuckyNumber().
•	Метод generateLuckyNumber изменять нельзя.
* */
public class Solution4 {
    //добавили после main(String[] args) throws Exception
    public static void main(String[] args) throws Exception{
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 15);
        if (luckyNumber == 13) {
            throw new Exception("не повезло число 13");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
