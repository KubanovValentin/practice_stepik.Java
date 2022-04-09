package Zaur_OOP.podpaket_lesson24.Interface;

public class Test2 {
    Jumpable j1=new Human();
    Jumpable j2=new Animal();
}
class Human implements Jumpable{
    @Override
    public void jamp() {
        System.out.println("Human jamp");
    }
}
class Animal implements Jumpable{
    @Override
    public void jamp() {
        System.out.println("Animal jamp");
    }
}
interface Jumpable{
    void jamp();
}
interface A2 {
    void abc();
}

interface B2 extends A2,Jumpable{
    void def();
}
abstract class D implements B2{

}