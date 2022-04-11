package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting;

public class TestPrimer {
}
class Car{
    static int a=5;

    public static void main(String[] args) {
        Car c=new Car();
        System.out.println(c.a);
        c=null;
        System.out.println(c.a);//static переменная относящаяся к объекту Car она будет иметь такое же значение static int a=5;
    }
}