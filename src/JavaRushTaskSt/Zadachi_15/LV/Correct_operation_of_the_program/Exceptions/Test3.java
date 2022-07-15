package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions;
/*
В данном примере исключение ArithmeticException может быть перехвачено и блоком catch(Exception e),
и блоком catch(ArithmeticException e). Оно будет захвачено тем блоком, который идет ближе к блоку try — первым блоком catch.

Чтобы не было неожиданностей, лучше всего блоки catch, которые могут захватить почти все исключения,
размещать ближе к концу списка блоков catch.
* */
public class Test3 {
    public static void main(String[] args)
    {
        System.out.println("Начало метода main");
        try
        {
            calculate(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Было деление на 0");
        }
        catch(Exception e)
        {
            System.out.println("Перехвачено какое-то исключение");
        }

        System.out.println("Конец метода main");
    }

    public static void calculate(int n)
    {
        System.out.println("calculate начало: " + n);
        System.out.println(2/n);
        System.out.println("calculate конец: " + n);
    }
}
