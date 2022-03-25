package Zaur_OOP.podpaket_lesson23.method_overriding.primer;

public class Test5 {
    public static void main(String[] args) {
        A c1=new C();
        c1.abc(new B());
    }
}
class A{
    void abc(A a){
        System.out.println("A");
    }
}
class B extends A{
    //overload
    void abc(B b1){
        System.out.println("B");
    }
}
class C extends B{
    @Override
    void abc(B b2){
        System.out.println("C");
    }
}