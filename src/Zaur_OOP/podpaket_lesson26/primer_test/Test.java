package Zaur_OOP.podpaket_lesson26.primer_test;

public class Test {
    void abc(short s){
        System.out.println("byte");
    }
    void abc(int i){
        System.out.println("int");
    }
    void abc(float f){
        System.out.println("float");
    }
    void abc(Object o){
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Test t=new Test();
        char c=55;
        t.abc(c);//abc(int i)
        t.abc(false);// void abc(Object o) boolean является сабклассом
        t.abc(3.14);// void abc(Object o) дефолт double не может во flat
    }
}
