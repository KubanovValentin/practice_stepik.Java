package Homework.homework_lesson24;

/*
Создайте абстрактный класс Animal,его конструктор пусть имеет параметр, значение которого начинается переменной
String name. В классе Animal создайте абстрактные методы eat и sleep.
 */
public abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

/*
Создайте абстрактный класс Fish, который является дочерним классом класса Animal, его конструктор пусть имеет параметр,
значение которого назначается переменным name данного и родительского класса. В классе Fish перезапишите метод sleep так,
чтобы он выводил на экран "Всегда интересно наблюдать, как спять рыбы.". Так же здесь создайте абстрактный метод swim.
 */
abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("It is always interesting to watch how fish sleep." +
                "//Всегда интересно наблюдать, как спять рыбы.");
    }

    abstract void swim();
}

/*
Создайте абстрактный класс Bird, который является дочерним классом класса Animal, его конструктор пусть имеет параметр,
значение которого назначается переменным name данного и родительского класса. Так же здесь создайте абстрактный метод fly.
 */
abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
//        Speakable.super.speak(); //у меня было у заура нет
        System.out.println(name + " sings//поет");
    }
}

/*
Создайте абстрактный класс Mammal, который является дочерним классом класса Animal, его конструктор пусть имеет параметр,
значение которого назначается переменным name данного и родительского класса. Так же здесь создайте абстрактный метод run.
 */
abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

/*
Создайте интерфейс Speakable, в котором пусть будет дефолтный метод speak, который выводит на экран "Somebody speaks".
Пусть класс Mammal имплементирует этот интерфейс. Также пусть класс Bird имплементирует этот интерфейс и перезаписывает
его метод так, чтоб он выводил на экран имя + "sings".
 */
interface Speakable {
    public default void speak() {
        System.out.println("Somebody speaks.//Кто-то говорит");
    }
}

/*
Создайте класс Mechenosec, который является дочерним классом класса Fish, его конструктор пусть имеет параметр,
значение которого назначается переменным name данного и родительского класса. В классе Mechenosec перезапишите метод swim
так, чтобы он вывел на экран "Mechenosec красивая рыба, которая быстро плавает!". Также перезапишите метод eat так, чтобы
он выводил на экран "Mechenosec не хищная рыба, и она ест обычный рыбный корм!".
 */
class Mechenosec extends Fish {
    public Mechenosec(String name ) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Mechenosec is a beautiful fish that swims fast!" +
                "//Mechenosec красивая рыба, которая быстро плавает!");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec is not a predatory fish, and it eats ordinary fish food!" +
                "//Mechenosec не хищная рыба, и она ест обычный рыбный корм!");
    }
}

/*
Создайте класс Pingvin, который является дочерним классом класса Bird, его конструктор пусть имеет параметр,
значение которого назначается переменным name данного и родительского класса. В классе Pingvin перезапишите метод eat так,
чтобы он выводил на экран "Pingvin любит есть рыбу!". Также перезапишите метод sleep так,чтобы он выводил на экран
"Pingvin спят практически друг к другу!". Также перезаписать speak так, чтобы он выводил на экран "Pingvin не умеет петь как соловей.".
 */
class Pingvin extends Bird {

    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvin loves to eat fish!" +
                "//Pingvin любит есть рыбу!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvin are sleeping snuggled up to each other!" +
                "//Pingvin спят прижавшись друг к другу!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvin can't fly!//Pingvin не умеют летать!");
    }

    @Override
    public void speak() {
//        super.speak(); //у меня было у заура нет
        System.out.println("Pingvin can't sing like a nightingale." +
                "//Pingvin не умеет петь как соловей.");
    }
}

/*
Создайте класс Lev, который является дочерним классом класса Mammal, его конструктор пусть имеет параметр,
значение которого назначается переменным name данного и родительского класса. В классе Lev перезапишите метод eat так,
чтобы он выводил на экран "Lev, как любой хищник, любит мясо!". Также перезапишите метод sleep так,чтобы он выводил на экран
"Большую часть дня Lev спит!".Также перезапишите метод run так,чтобы он выводил на экран "Lev- это не самая быстрая кошка!".
 */
class Lev extends Mammal {

    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev, like any predator, loves meat!//Lev, как любой хищник, любит мясо!");
    }

    @Override
    public void sleep() {
        System.out.println("Lev sleeps most of the day!//Большую часть дня Lev спит!");
    }

    @Override
    public void run() {
        System.out.println("Lev is not the fastest cat!//Lev- это не самая быстрая кошка!");
    }

}

class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("MECH");
        System.out.println("1.");
        System.out.println("My name is a: " + mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        System.out.println("2.");

        Speakable speakable = new Pingvin("PINGV1");
        speakable.speak();
        Pingvin pingvin = new Pingvin("PINGV2");
        pingvin.eat();
        pingvin.speak();
        pingvin.sleep();
        pingvin.fly();
        System.out.println("3.");

        Animal animal = new Lev("LEVA_animal");
        System.out.println("My name is a: " + animal.name);
        animal.eat();
        animal.sleep();
        System.out.println("4.");

        Mammal mammal = new Lev("LEVA_mammal");
        System.out.println("My name is a: " + mammal.name);
        mammal.speak();
        mammal.eat();
        mammal.sleep();
        mammal.run();
    }
}