package Zaur_OOP.podpaket_lesson26.initializer_block;

public class Test3  {
    int a=3;
    public Test3() {
        a=4;
    }
    {
        a=5;
    }

    public static void main(String[] args) {
        Test3 t3=new Test3();
        System.out.println(t3.a);
    }
}
