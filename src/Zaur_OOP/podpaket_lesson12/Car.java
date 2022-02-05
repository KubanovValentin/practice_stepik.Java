package Zaur_OOP.podpaket_lesson12;

public class Car {
    int engine;
    int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}
class CarTest{
    Car c1=new Car(3,4);
    Car c2=new Car(2,5);
}
