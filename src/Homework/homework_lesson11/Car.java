package Homework.homework_lesson11;

public class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

//    public void doorsInfo(int d){
//    doors=d;
//        System.out.println(doors);
//    }
}
class CarTest{

    void changeDoorCount(Car c,int doorCount){
        c.doorCount=doorCount;
    }

    void changeColor(Car c1,Car c2){
        String color=c1.color;
        c1.color=c2.color;
        c2.color=color;
    }

    public static void main(String[] args) {
//        Car car=new Car();
//        car.doorsInfo(5);
        CarTest ct=new CarTest();
        Car car1=new Car("red","v6",2);
        Car car2=new Car("blue","v4",4);
        ct.changeDoorCount(car1,3);
        ct.changeColor(car1,car2);
        System.out.println("машина номер 1 - "+ " zvet: "+car1.color+ ", motor: "+ car1.engine+", kol-vo dverei: "+car1.doorCount);
        System.out.println("машина номер 2 - "+ " zvet: "+car2.color+ ", motor: "+ car2.engine+", kol-vo dverei: "+car2.doorCount);
    }


}
