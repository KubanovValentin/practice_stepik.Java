package AlishevCourse.Day10.Anonymous_classes.Test2;

public class Test2 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("nam nam nam....");
            }
        };
        ableToEat.eat();
    }
}

interface AbleToEat {
    public void eat();
}