package Andrey_Sumin_Object_oriented_programming.Interface;

public class Dog extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Кость");
    }
    //научим собаку бегать
    public void run(){
        System.out.println("Собака бежит");
    }
}
