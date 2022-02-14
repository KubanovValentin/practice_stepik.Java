package Zaur_OOP.podpaket_class_String_lesson16;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }


}

class TestCar {

    final static Car c = new Car("red", "v12");//c не может ссылаться на другой объект - потому что final

                                                            // но цвет или мотом могут изменяться
                                                            // (а что внутри меняется - final не влияет)
    public static void main(String[] args) {
          c.color="black";                                  //вот поменяли
        System.out.println(c.color);

    }
}