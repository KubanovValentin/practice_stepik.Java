package Zaur_OOP.podpaket_lesson30.Test29;

public class Test {
}
class A{
    private int a=3;
    public void abc(){
        System.out.println("method abc");
    }
    public void def(){
        System.out.println("method def");
    }
}
class B extends A{
    public int a=5;
    public void def(){
        System.out.println("method def");
    }
}
class C{
    public static void main(String[] args) {
        A test1=new A();
        A test2=new B();
//        System.out.println(test1.a);//error
 //       System.out.println(test2.a);//error
    }
}