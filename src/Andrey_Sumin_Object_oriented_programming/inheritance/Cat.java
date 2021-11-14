package Andrey_Sumin_Object_oriented_programming.inheritance;

public class Cat extends CatFamily{
    //создадим конструктор без параметров
    public Cat(){
//        bigClaws=false;
        super(2,4,false);
    }
@Override
    public void eat() {
        super.eat();
        System.out.println(" рыбой");
    }
}
