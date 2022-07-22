package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 7, 9};
        System.out.println("we have an array");
//        for (int i=0;i< array.length;i++){
//            System.out.println(array[i]);
//        }

        try {
            System.out.println(array[6]);
            System.out.println("good luck");
        } catch (ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException-тип,имя-e
            System.out.println("was caught Exception  -  " + "( " + e + " )");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("this code is not related to the exception");
    }
}
