package Zaur_OOP.podpaket_lesson23.method_overriding.primer;

public class Test4 {
}
class Animal2{
    static String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of animal: "+showName());
    }
}
class Mouse2 extends Animal2{
    //hiding
    static String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of animal: "+showName());
    }
    public static void main(String[] args) {
        Animal2 a2=new Animal2();
        a2.showInfoAboutAnimal();

        Animal2 am2=new Mouse2();
        am2.showInfoAboutAnimal();

        Mouse2 m2=new Mouse2();
        m2.showInfoAboutAnimal();
        m2.showInfoAboutMouse();
    }
}