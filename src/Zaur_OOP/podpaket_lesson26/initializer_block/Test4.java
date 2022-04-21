package Zaur_OOP.podpaket_lesson26.initializer_block;

public class Test4 {
    int a = 3;

    public Test4() {
        a = 4;
    }

    {
        a = 5;
    }
}

class A {
    static final int b;
    int a = 5;

    static {
        b = 10;

    }

    {
        a = 5;
    }
}
class B{
    static int c;
    static final int d;
    static final int e=1;
    static final int f;
    static {
        c=3;
        d=4;
        f=5;
    }
}
class C{
    String s="ok";
    {
        System.out.println(s);
    }
    static int i=0;
    static {
        System.out.println(i);
    }
     {
        i=i+1;
        System.out.println(i);
    }

    public C() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("hello");
        C c=new C();
    }
}
class D{
    static {abc(2);}
    static void abc(int a){
        System.out.println(a+" ");
    }
    D(){
        abc(5);
    }
    static {abc(4);}
    {abc(6);}
    static {new D();}
    {abc(8);}
//2 4 6 8 5
    public static void main(String[] args) {

    }
}