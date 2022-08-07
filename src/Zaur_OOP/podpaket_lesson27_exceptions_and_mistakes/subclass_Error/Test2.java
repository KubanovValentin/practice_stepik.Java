package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.subclass_Error;
//StackOverflowError
public class Test2 {
    void abc(){
        System.out.println("method abc");
        throw new StackOverflowError();
    }
    void def(){
        try {
            abc();
            return;
        }finally {
            System.out.println("finally block");
        }
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        t.def();
    }
}
