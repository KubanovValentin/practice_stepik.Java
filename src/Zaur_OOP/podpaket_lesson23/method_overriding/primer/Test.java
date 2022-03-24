package Zaur_OOP.podpaket_lesson23.method_overriding.primer;

public class Test {
    void abc(Animal a){
        System.out.println("A");
    }
  //  Overload
    void abc(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test t=new Test();
        Animal an=new Mouse();
        t.abc(an);
        an.getName();
    }
}
class Animal{

    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}