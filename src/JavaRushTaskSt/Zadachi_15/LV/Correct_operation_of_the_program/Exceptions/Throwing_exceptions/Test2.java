package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;
//2. Свое исключение
//-----------------------------------
/*
Кстати, вы можете сами создать объект-исключение: это просто объект типа Exception или унаследованного от него класса.
И выбросить его.
Это проще, чем кажется. Пример:

* */
public class Test2 {
    public static void main(String[] args) {
        try
        {
            throw new RuntimeException();
        }
        catch(Exception except)
        {
            System.out.println("Перехватили исключение");
            throw except;
        }
    }
}
/*
В примере выше мы создали новый объект-исключение типа RuntimeException и тут же выбросили его с помощью оператора throw.
Оно будет сразу захвачено блоком catch, т.к. тип RuntimeException унаследован от типа Exception.
Код catch(Exception except) захватывает объекты-исключения всех классов, унаследованных от класса Exception.

* */