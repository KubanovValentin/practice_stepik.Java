package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting;

public class Test6 {
    public static void main(String[] args) {
        Test30 t30=new Test30();

        System.out.println(((Test10)t30).a);
        System.out.println(((Test20)t30).a);
        System.out.println(t30.a);
//        ((Test20)t30).abc();
        t30.abc();
    }
}
class Test10{
    int a=5;
    void abc(){
        System.out.println("ok1");
    }
}
class Test20 extends Test10{
    int a=10;
    @Override
    void abc() {
        super.abc();
        System.out.println("ok2");
    }
}
class Test30 extends Test20{
    int a=15;
    @Override
    void abc() {
        super.abc();
        System.out.println("ok3");
    }
}