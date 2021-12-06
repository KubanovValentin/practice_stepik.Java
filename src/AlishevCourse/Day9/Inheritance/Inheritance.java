package AlishevCourse.Day9.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.eat();
        dog.showName();
    }
}

class Animal {
    String name="some animal";

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    public void eat(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("I am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}