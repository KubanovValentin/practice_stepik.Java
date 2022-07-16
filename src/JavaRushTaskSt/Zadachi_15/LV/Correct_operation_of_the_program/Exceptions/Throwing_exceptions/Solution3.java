package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;
/*
Перехвати исключение в методе main, чтобы программа компилировалась.
При возникновении исключения нужно вывести на экран строку errorMessage.

Требования:
•	В методе main нужно добавить блок try-catch.
•	Метод main не должен бросать проверяемые исключения.
•	Метод main должен вызывать метод generateLuckyNumber.
•	Метод generateLuckyNumber изменять нельзя.
•	При возникновении исключения в методе main нужно вывести на экран строку errorMessage.
* */
public class Solution3 {
    public static String errorMessage = "не повезло";

    public static void main(String[] args) {
//        generateLuckyNumber();
        try {
            generateLuckyNumber();
        }catch (Exception e){
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
