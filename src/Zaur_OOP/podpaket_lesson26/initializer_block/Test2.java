package Zaur_OOP.podpaket_lesson26.initializer_block;

public class Test2 {
    {
        System.out.println("initializer block 3");
    }

    public Test2() {
        System.out.println("constructor () ");
    }
    public Test2(int a) {
        this();
        System.out.println("constructor (int a) ");
    }
    {
        System.out.println("initializer block 1");
    }
    static {
        System.out.println(" static initializer block 1");
    }
    {
        System.out.println("initializer block 2");
    }
    static {
        System.out.println(" static initializer block 2");
    }

    public static void main(String[] args) {
        Test2 t2=new Test2();
        Test2 t3=new Test2(3);
    }
}


