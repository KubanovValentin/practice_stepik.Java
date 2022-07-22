package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

public class Test4 {
    void abc()throws NullPointerException{
        String s=null;
        System.out.println(s.length());
    }

    public static void main(String[] args)  {
        Test4 t4=new Test4();
        t4.abc();
    }
}
