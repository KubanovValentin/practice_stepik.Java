package JavaRushTaskSt.Zadachi_15.LV.Stack_trace.StackTraceElement;

public class Test {
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(StackTraceElement info: methods)
        {
            System.out.println(info.getClassName());
            System.out.println(info.getMethodName());

            System.out.println(info.getFileName());
            System.out.println(info.getLineNumber());

            System.out.println(info.getModuleName());
            System.out.println(info.getModuleVersion());
            System.out.println();
        }
    }
}
//Вывод на экран
/*
java.lang.Thread      имя класса
getStackTrace         имя метода
Thread.java           имя файла
1606                  номер строки
java.base             имя модуля
11.0.2                версия модуля

Main                  имя класса
test                  имя метода
Main.java             имя файла
11                    номер строки
null                  имя модуля
null

Main                  имя класса
main                  имя метода
Main.java             имя файла
5                     номер строки
null                  имя модуля
null                  версия модуля

 */