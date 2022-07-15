package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;
/*
Запусти программу и посмотри, что происходит.
В методе eat добавь блок finally, чтобы лев ложился спать, даже если ему не удалось перекусить.

Ожидаемый вывод в случае, когда food != null:
ищет еду
нашел мясо
все съел
лег спать

Ожидаемый вывод когда food == null:
ищет еду
ничего не нашел
лег спать голодным

Требования:
•	В методе eat должен быть блок finally.
•	Вывод должен соответствовать условию.
* */
public class Solution2 {
    public static void main(String[] args) {
        Solution2Lion lion  = new Solution2Lion();
        lion.eat(new Solution2Food("мясо"));
        lion.eat(null);
    }
}
