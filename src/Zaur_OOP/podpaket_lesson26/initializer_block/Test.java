package Zaur_OOP.podpaket_lesson26.initializer_block;

public class Test {
    String s1;
    {
        //initializer block (инишалайзен блок)->{}
        //это третий вариант где можно писать код
        s1="ok";
        System.out.println(s1);
        System.out.println("Hello");

        int a=5;
        System.out.println(a);

    }

    public static void main(String[] args) {
        Test t3=new Test();
        Test t4=new Test();
    }
}
