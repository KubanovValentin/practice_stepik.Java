package AlishevCourse.Day10.Anonymous_classes.Test1;

public class Test1 {
    public static void main(String[] args) {
    AbleToEat ableToEat=new Animal();
    ableToEat.eat();
    }
}
interface AbleToEat{
    public void eat();
}

class Animal implements AbleToEat{
    @Override
    public void eat() {
        System.out.println("eat chrum....");
    }
}
//но нам не надо много раз использовать метод а только один раз и поэтому дальше в Test2