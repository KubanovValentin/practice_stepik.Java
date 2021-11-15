package Andrey_Sumin_Object_oriented_programming.inheritance2;

public abstract class Figure {
   private double a;
   private double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public abstract double area();

    //создадим доступ к сторонам через гетерры

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }
}
