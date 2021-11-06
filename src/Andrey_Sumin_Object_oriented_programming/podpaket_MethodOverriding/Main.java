package Andrey_Sumin_Object_oriented_programming.podpaket_MethodOverriding;

public class Main {
    public static void main(String[] args) {
        //написав static в методах мы коментируем ниже все(работате все ниже без static)


//        Test test=new Test();
        //сохраним результат умножения в переменную result
        //если мы напишем числа добл то будет ошибка т.к у нас на вход инт
//        int result=test.multiple(6,5);
        //для этого мы создали метод с даблами и вывели
//        double result1=test.multiple(5.5,6.6);

//        int result2=test.multiple(5);
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);

// -------  в методах написали static и пишем ниже код

        //создаем переменную result
        //не надо создавать объект как выше
    int result=Test.multiple(5);
    double sqrt=Math.sqrt(36);
        System.out.println(result);
        System.out.println(sqrt);
    }
}
