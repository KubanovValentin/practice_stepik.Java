package Zaur_OOP.podpaket_lesson24;

public class Test {

}
/*
применив final модификатор к методу main его функционал не изменится,
 а в сабклассе тест уже не сможем делать оверлайдить или хайдить
 */
class A{
    String s="privet";
    void abc(){
        System.out.println("???");
    }
}
class B extends A{
    String s="poka";
    @Override
    void abc(){
        System.out.println("!!!");
    }
}
class C extends B{
    public static void main(String[] args) {
        C c=new C();
        c.abc();
        System.out.println(c.s);
    }
}