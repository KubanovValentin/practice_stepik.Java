package Andrey_Sumin_Object_oriented_programming.Interface;

public class Cat extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Вискас");
    }
    public void run(){
        System.out.println("Кот бежит");
    }
}
