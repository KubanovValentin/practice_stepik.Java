package Andrey_Sumin_Object_oriented_programming.inheritance2;

public class Main {
    public static void main(String[] args) {
        Rect rect=new Rect(5,10);
        Triangle triangle=new Triangle(10);
        System.out.println(rect.area());
        System.out.println(triangle.area());
    }
}
