package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes;

public class  Test1 {
    public static void main(String[] args) {
        int array[]={3,1,5};
//   System.out.println(array[5]);-->
//   -->Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        String s =null;//ничего, нет объекта на который ссылается переменная
//        System.out.println(s.length());-->
// -->Exception in thread "main" java.lang.NullPointerException
        System.out.println("hello");
    }
}
