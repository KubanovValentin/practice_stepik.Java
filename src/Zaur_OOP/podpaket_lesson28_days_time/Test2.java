package Zaur_OOP.podpaket_lesson28_days_time;

public class Test2 {
    public static void main(String[] args) {
        Car c = Car.createCar();
    }
}

class Car {
    private Car() {
    }

    static Car createCar() {
        return new Car();
    }
}