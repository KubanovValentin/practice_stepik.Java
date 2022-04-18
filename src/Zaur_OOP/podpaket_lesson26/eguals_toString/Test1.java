package Zaur_OOP.podpaket_lesson26.eguals_toString;

//метод equals
//public boolean equals(Object obj){
//    return (this==obj);
//        }

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v4");
        Car c2 = new Car("red", "v4");
        Car c3 = new Car("black", "v8");
        Car c4 = null;
        System.out.println(c1.equals(c3));

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c3);
        list.add(c4);
        list.add(c2);
        System.out.println(list.contains(c2));
        System.out.println(c1.equals(null));
        System.out.println(c1);//toString
//        System.out.println(c4.equals(c2)); Exception

    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine));
        } else {
            return false;
        }
    }

    //оверайдим метод тустринг
    public String toString() {
        return "Машина цвета " + color + " и с мотором " + engine;
    }
}