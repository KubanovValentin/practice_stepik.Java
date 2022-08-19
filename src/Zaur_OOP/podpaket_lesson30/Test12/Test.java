package Zaur_OOP.podpaket_lesson30.Test12;

public class Test {
    void abc(){
        try {
            def();
            return;
        }finally {
            System.out.println("finally");
        }
    }
    void def(){
        System.out.println("def");
        throw new StackOverflowError();
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.abc();
    }
}
