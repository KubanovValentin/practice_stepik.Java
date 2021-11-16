package Andrey_Sumin_Object_oriented_programming.Interface.homework;

public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer("Валентин");
        Driver driver=new Driver("Иван");
        Cook cook=new Cook("Валера");

        System.out.print(programmer.infoName()+" ");
        programmer.programming();
        System.out.print(driver.getName()+" ");
        driver.drive();
        System.out.print(cook.getName()+" ");
        cook.cooks();
    }
}
