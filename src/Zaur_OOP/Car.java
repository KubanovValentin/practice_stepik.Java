package Zaur_OOP;

public class Car {
    //дефолтный конструктор-не имеет параметров и внутри тела нет ничего.
    // если мы не создаем конструктор то компилятор создает его за нас
    // пример ниже
    // Car(){}


    String color = "red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        int a;
        Car ca1 = new Car();
        Car car2 = new Car();
        ca1.color = "black";
        ca1.engine = "V8";
        System.out.println("Цвет машины: " + ca1.color + "\nМотор машины: " + ca1.engine);

//        System.out.println(new Car().color);
    }
}