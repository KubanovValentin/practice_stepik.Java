package Zaur_OOP;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        int a;
        Car ca1 = new Car();
        Car car2 = new Car();
        Car car3;
        System.out.println(car2.engine);
        System.out.println(new Car().color);
    }
}