package Andrey_Sumin_Object_oriented_programming.Interface.homework;

public abstract class  Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }
     public abstract String infoName();

    public String getName() {
        return name;
    }
    public void voice(){
        System.out.println(name);
    }
}
