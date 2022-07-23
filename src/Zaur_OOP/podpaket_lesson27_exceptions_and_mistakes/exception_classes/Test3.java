package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

public class Test3 {
    public static void main(String[] args) throws Exception{
        int []array = {1, 4, 9};
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("this is Exception = " + e);
        }

        System.out.println("hello");
    }
}
