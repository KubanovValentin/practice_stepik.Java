package Andrey_Sumin_Object_oriented_programming.podpaket_constructor;

public class Main {
    public static void main(String[] args) {
        //создадим новую коробку
        Box2 box=new Box2();
        System.out.println(box.volueme());
        //создаем новую коробку и узнаем ее объем
        Box2 box2=new Box2();
        System.out.println(box2.volueme());
        //создаем новую коробку для конструктора с параметрами
        Box2 box3=new Box2(13,23,35);
        System.out.println(box3.volueme());

    }
}
