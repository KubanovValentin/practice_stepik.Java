package Zaur_OOP.podpaket_lesson23.method_overriding.primer;

public class Test3 {
}
class Animal1{
    String showName(){
        return "some Animal";
    }
    void showInfo(){
        System.out.println("Name of animal: "+showName());
    }
}
class Mouse1 extends Animal1{
    String showName(){
        return "mouse";
    }

    public static void main(String[] args) {
        Animal1 a1=new Animal1();
        a1.showInfo();

        Animal1 am1=new Mouse1();
        am1.showInfo();

    }
}