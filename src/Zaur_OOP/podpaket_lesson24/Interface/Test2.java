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