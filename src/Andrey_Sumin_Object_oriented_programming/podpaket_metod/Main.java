package Andrey_Sumin_Object_oriented_programming.podpaket_metod;

public class Main {
    public static void main(String[] args) {
//        Andrey_Sumin_Object_oriented_programming.Test test=new Andrey_Sumin_Object_oriented_programming.Test();
//        int square= test.square(15);
//        double sqrt=Math.sqrt(36);
//        System.out.println(square);
//        System.out.println(sqrt);

//закоментим выше и создадим новую коробку
        Box1 box1=new Box1();
        box1.setDimens(15,15,15);
        //вычислим объем
        System.out.println(box1.volueme());
    }
}
