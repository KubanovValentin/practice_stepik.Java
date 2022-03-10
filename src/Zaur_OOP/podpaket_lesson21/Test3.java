package Zaur_OOP.podpaket_lesson21;

public class Test3 {
     Test3() {
        System.out.println("создался объект Teat3 с помощью конструктора");
    }
    void Test3(){
        System.out.println("это метод");
    }
}
class A{
    public static void main(String[] args) {
        Test3 t3=new Test3();
        t3.Test3();
    }

}