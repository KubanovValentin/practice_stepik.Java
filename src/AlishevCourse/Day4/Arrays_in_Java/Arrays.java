package AlishevCourse.Day4.Arrays_in_Java;

public class Arrays {
    public static void main(String[] args) {
        int number=10;//примитивный тип данных.[10]коробка в которой лежит значение
//        char character='a';//примитивный тип данных
//        String s="Hello";//ссылочный тип данных.объект класса стринг
        //строку можно создать и так(ниже)
//        String s1=new String("Hello");//создали объект класса
        int[]numbers=new int[5];// переменная numbers -->(ссылаеться)[массив] ссылочный тип данных
//        у нас 5 пустых ячеек и они не проинициализированны(но defolt значение - 0)
        System.out.println(numbers[0]); //0 1 2 3 4
        //цикл for очень хорошо подходит для инициализации массива
        for (int i=0;i< numbers.length;i++){
            numbers[i]=i*10;
            //проинициализировали массив и теперь надо вывести на экран
        }
        for (int i =0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        //если мы знаем какие числа хотим поместить то пишем массив так
        int[]numbers1={1,2,3,4,5};
        for (int i=0;i<numbers1.length;i++){
            System.out.print(numbers1[i]+" ");
        }
    }
}
