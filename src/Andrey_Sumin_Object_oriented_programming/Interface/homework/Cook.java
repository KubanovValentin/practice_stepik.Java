package Andrey_Sumin_Object_oriented_programming.Interface.homework;

public class Cook extends Worker implements Cooks{
    public Cook(String name) {
        super(name);
    }
    public String infoName() {
        return getName();
    }

    @Override
    public void cooks() {
        System.out.println("умеет готовить еду");
    }
}
