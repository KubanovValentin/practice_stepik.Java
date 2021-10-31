package Zaur_OOP;

public class CarConstructor {
    CarConstructor(String cvet, String motor) {
        color = cvet;
        engine = motor;
    }

    String color;
    String engine;
}

class CarConstructorTest {
    public static void main(String[] args) {
        CarConstructor car1 = new CarConstructor("red","V4");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}