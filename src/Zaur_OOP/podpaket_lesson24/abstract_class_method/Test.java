package Zaur_OOP.podpaket_lesson24.abstract_class_method;

public class Test {
    public static void main(String[] args) {
        Figura f = new Square(4);
        System.out.println(f.kolichestvoStoron);
        f.square();
        f.perimeter();

        Square square = new Square(4);
//        square.perimeter();
//        square.square();

    }
}

abstract class Figura {
    int kolichestvoStoron = 0;

    public Figura(int kolichestvoStoron) {
        this.kolichestvoStoron = kolichestvoStoron;
    }

    abstract void perimeter();

    abstract void square();

    void showInfo() {
        System.out.println("this is a figure");
    }
}

class Square extends Figura {
    int kolichestvoStoron = 4;

    public Square(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int side = 10;

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the square = " + 4 * side);
    }

    @Override
    public void square() {
        System.out.println("Square of the square = " + side * side);
    }

}

class XXX extends Square {
    public XXX(int kolichestvoStoron) {
        super(kolichestvoStoron);
    }
}

class Rectangle extends Figura {
    int kolichestvoStoron = 4;

    public Rectangle(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int sideA = 8;
    int sideB = 5;

    @Override
    void perimeter() {
        System.out.println("Perimeter of the rectangle = " + 2 * (sideA + sideB));
    }

    @Override
    void square() {
        System.out.println("Square of the rectangle = " + sideA * sideB);
    }
}

class Circle extends Figura {
    int kolichestvoStoron = 0;

    public Circle(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int radius = 3;

    @Override
    void perimeter() {
        System.out.println("Perimeter of the circle = " + 2 * 3.14 * radius);
    }

    @Override
    void square() {
        System.out.println("Square of the circle = " + 3.14 * radius * radius);
    }
}

abstract class Quadrilateral extends Figura {

    public Quadrilateral(int kolichestvoStoron) {
        super(kolichestvoStoron);
    }

    void def() {
        System.out.println("this is a quadrilateral");
    }
}