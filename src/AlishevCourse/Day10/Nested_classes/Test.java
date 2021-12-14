package AlishevCourse.Day10.Nested_classes;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar=new Electrocar(1);
        electrocar.start();
        Electrocar.Battery battery=new Electrocar.Battery();
        battery.charge();

    }
}
