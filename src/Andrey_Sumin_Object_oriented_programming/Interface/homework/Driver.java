package Andrey_Sumin_Object_oriented_programming.Interface.homework;

public class Driver extends Worker implements Drive{
    public Driver(String name) {
        super(name);
    }
    public String infoName() {
        return getName();
    }

    @Override
    public void drive() {
        System.out.println("умеет водить машину");
    }
}
