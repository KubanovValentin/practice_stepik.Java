package JavaRushTaskSt.Zadachi_15.LV.Stack_trace;

public class Test {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        Thread current=Thread.currentThread();
        StackTraceElement[] methods=current.getStackTrace();

        for (var info:methods)
            System.out.println(info);
    }
}
/*
Как мы видим по выводу на экран, в приведенном примере метод getStackTrace() вернул массив из трех элементов:

Метод getStackTrace() класса Thread
Метод test() класса Main
Метод main() класса Main
Из этого стек-трейса можно сделать вывод, что:

Метод Thread.getStackTrace() был вызван методом Main.test() в строке 11 файла Main.java
Метод Main.test() был вызван методом Main.main() в строке 5 файла Main.java
Метод Main.main() никто не вызывал — это первый метод в цепочке вызовов.
Кстати, на экране отобразилась только часть всей имеющийся информации.
Все остальное можно получить прямо из объекта StackTraceElement
* */