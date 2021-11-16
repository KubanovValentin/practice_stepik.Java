package Andrey_Sumin_Object_oriented_programming.Interface.homework;

public class Programmer extends Worker implements Programming{
    public Programmer(String name) {
        super(name);
    }


    @Override
    public String infoName() {
        return getName();
    }

    @Override
    public void programming() {
        System.out.println("умеет писать код");
    }
}
