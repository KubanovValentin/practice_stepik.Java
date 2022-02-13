package Zaur_OOP.podpaket_class_String;

public class Car2 {
    String color;
    String engine;

    public Car2(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    public Car2 abc(String zvet){
        Car2 c10=new Car2(zvet,"v4");
        return c10;
    }

    public static void main(String[] args) {
        Car2 c2=new Car2("red","v6");
        Car2 c3=c2.abc("black");
        System.out.println(c2.color);
        System.out.println(c3.color);
    }
}
