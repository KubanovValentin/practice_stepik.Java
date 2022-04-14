package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting.Test_proverka;

public class Test implements interface1,interface2{
    public void abc(){
        System.out.println("ok");
    }
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(((interface1)t).a);//чтобы увидеть переменную надо сделать кастинг
        ((interface1)t).abc();
    }
}
interface interface1{
    int a=5;
    void abc();
}
interface interface2{
    int a=10;
    void abc();
}