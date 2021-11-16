package Andrey_Sumin_Object_oriented_programming.Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Fish fish = new Fish();
//        Bird bird = new Bird();
//        //сделаем так чтоб животные покушали
//        ArrayList<Animal>animals=new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//        animals.add(fish);
//        animals.add(bird);
        //у всех переменных вызывали один и тотже метод
//        for (Animal animal:animals){
//            animal.eat();
//        }
//        //создаем новую собаку и запускаем метод ран
//        Dog dog1=new Dog();
//        dog1.run();

        //ДАУНКАСТ-привод родительского класса к дочернему
//        Animal animal=dog1;
//        dog1=(Dog)animal;
//        dog1.run();

        // АПКАСТ-привод дочернего типа к родительскому
//        Animal animal=new Cat();


//        Cat cat1=new Cat();
//        Animal animal1=cat1;
//        Dog dog2=(Dog) animal1;
//-------------------------
        //закоментили как только сделали метод у кота run

        //надо сделать чтоб они побежали
//        Dog dog1=new Dog();
//        Dog dog2=new Dog();
//        Dog dog3=new Dog();
//        Dog dog4=new Dog();
//        Dog dog5=new Dog();
//
//        Cat cat1=new Cat();
//        Cat cat2=new Cat();
//        Cat cat3=new Cat();
//        Cat cat4=new Cat();
//        Cat cat5=new Cat();
//
//        Bird bird1=new Bird();
//        Bird bird2=new Bird();
//        Bird bird3=new Bird();
//
//        ArrayList<CanRun>animals=new ArrayList<>();
//        animals.add(dog1);
//        animals.add(cat1);
//        animals.add(bird1);
//
//        for (CanRun animal: animals){
//            animal.run();
//        }

// -----------------------------

        Dog dog=new Dog();
        //сделаем апкаст
        CanRun canRun=dog;
//        canRun.eat();//нету метода чтоб зазаботало надо сделать даункаст
        dog=(Dog) canRun;
//создадим объект типа Flyable
        Flyable flyable = new Bird();
        flyable.fly();
    }
}
