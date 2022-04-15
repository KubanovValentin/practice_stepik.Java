package Homework.homework_lesson25;


class Pusk {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Animal_Mechenosec");
        Animal a2 = new Pingvin("Animal_Pingvin");
        Animal a3 = new Lev("Animal_Lev");
        Fish f1 = new Mechenosec("Fish_Mechenosec");
        Bird b1 = new Pingvin("Bird_Pingvin");
        Mammal m1 = new Lev("Mammal_Lev");
        Mechenosec mech1 = new Mechenosec("Mechenosec_Mechenosec");
        Pingvin p1 = new Pingvin("Pingvin_Pingvin");
        Lev l1 = new Lev("Lev_Lev");
        Speakable s1 = new Pingvin("Speakable_Pingvin");
        Speakable s2 = new Lev("Speakable_Lev");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }else if (a instanceof Lev){
                Lev l=(Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.speak();
                l.sleep();
            }
            System.out.println("----------------------------------------------------");
        }
        for (Speakable s:array2){
            if (s instanceof Pingvin){
                Pingvin p=(Pingvin) s;
                System.out.println(p.name);
                p.speak();
                p.fly();
                p.eat();
                p.sleep();
            }else if (s instanceof Lev){
                Lev l=(Lev) s;
                System.out.println(l.name);
                l.sleep();
                l.eat();
                l.speak();
                l.run();
            }
            System.out.println("----------------------------------------------------");
        }

    }
}

public abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

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

abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    public default void speak() {
        System.out.println("Somebody speaks.//Кто-то говорит");
    }
}

class Mechenosec extends Fish {
    public Mechenosec(String name) {
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