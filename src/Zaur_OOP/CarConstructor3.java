package Zaur_OOP;

public class CarConstructor3 {
    CarConstructor3(String cvet, String motor) {
        color = cvet;
        engine = motor;
        System.out.println(" цвет машины: " + color + " \n мотор машины: " + engine);
    }

    String color;
    String engine;
}

class CarConstructor3Test {
    public static void main(String[] args) {
        CarConstructor3 car1 = new CarConstructor3("black", "V8");
        CarConstructor3 car2 = new CarConstructor3("red", "V4");
    }

}