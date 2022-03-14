package Homework.homework_lesson22_OOP;


import Homework.homework.lesson10.p1.A;

//tz2
public class Test2 {
    /*
Создайте класс Animal. При вызове его конструктора пусть на экран выводится "I am animal". В классе пусть будут переменная eyes,
характеризующая количество глаз;методы eat(выводящий на экран "Animal eats") и drink(выводящий на экран "Animal drinks").

Создайте класс Pet, который является child класса Animal. При вызове его конструктора пусть на экран выводится "I am pet"
и переменной eyes придается значение 2.В классе будут переменные name;tail, характеризующая количество хвостов и равная 1;
paw, характеризующая лап и равная 4; методы run(выводящий на экран "Pet run") и jump(выводящий на экран "Pet jumps").

Создайте класс Dog, который является child классом Pet. При вызове его конструктора с параметром, который будет передавать
имя, пусть на экран выводится "I am dog and my name is:"+имя питомца. В класс добавьте метод play(выводящий на экран "Dog plays").

Создайте класс Cat, который является child классом Pet. При вызове его конструктора с параметром, который будет передавать
имя, пусть на экран выводится "I am cat and my name is:"+имя питомца. В класс добавьте метод sleep(выводящий на экран
("Cat sleeps")).

Создайте класс Test, в методе main которого выведите на экран количество лап объекта класса Dog и вызовите метод sleep
объекта класса Cat.
     */
}

class Animal {

    int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail=1;
    int paw=4;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(int eyes) {
        super();
        System.out.println("I am pet");
    }
    public void run(){
        System.out.println("Pet run");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }

}
class Dog extends Pet{
    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: "+name);
    }
    public void play(){
        System.out.println("Dog plays");
    }
}
class Cat extends Pet{
    public Cat(String name) {
        super(name);
        System.out.println("I am cat and my name is: "+name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
class AnimalTest {
    public static void main(String[] args) {
//        Animal animal=new Animal();
//        animal.eat();
//        animal.drink();
//        Pet pet=new Pet(2);
        Dog dog=new Dog("шарик");
        System.out.println("У "+dog.name+"-"+dog.paw+" лапы");
        Cat cat=new Cat("барсик");
        cat.sleep();

    }
}