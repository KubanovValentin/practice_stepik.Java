package Andrey_Sumin_Object_oriented_programming.inheritance;

public class Lion extends CatFamily{
    public Lion(){
        super(2,4,true);
    }
    //переопледеление метода суперкласса
    @Override
    public void eat() {
        super.eat();
        System.out.println(" мясом");
    }

}
