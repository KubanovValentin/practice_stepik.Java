package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;

public class Test4 {

}
//------------------------------------------------
/*
checked-исключение

public void calculate(int n) throws Exception
{
   if (n == 0)
      throw new Exception("n равно нулю!");
}
* */
//--------------------------------------------
/*
unchecked-исключение
public void calculate(n)
{
   if (n == 0)
      throw new RuntimeException("n равно нулю!");
}
* */
//-------------------------------------------------------------
/*
В примере справа наш код выкидывает unchecked-исключение — никаких дополнительных действий не нужно.
В примере слева метод выкидывает checked-исключение,
поэтому в сигнатуру метода добавили ключевое слово throws и указали тип исключения.
* */
//------------------------------------------------------------
/*
Если метод планирует выкидывать несколько checked-исключений,
все их нужно указать после ключевого слова throws через запятую. Порядок неважен. Пример:

public void calculate(int n) throws Exception, IOException
{
   if (n == 0)
      throw new Exception("n равно нулю!");
   if (n == 1)
      throw new IOException("n равно единице");
}
* */
//------------------------------------------------------------
/*
Пример:

Представим, что мы пишем метод, который должен создать мир, населенный людьми.
Начальное количество человек передается в качестве параметра.
Тогда мы должны добавить исключения, если людей слишком мало.
//----------
Создаем Землю

public void создатьМир(int n) throws ПустойМир,ОдинокийМир
{
   if (n == 0)
      throw new ПустойМир("Людей вообще нет!");
   if (n == 1)
      throw new ОдинокийМир("Слишком мало людей!");
   System.out.println("Создан прекрасный мир. Население: " + n);
}
//----------
Метод потенциально кидает два checked-исключения:
ПустойМир
ОдинокийМир

* */
//-----------------------------------------