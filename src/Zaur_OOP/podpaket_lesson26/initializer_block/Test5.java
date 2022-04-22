package Zaur_OOP.podpaket_lesson26.initializer_block;

public class Test5 {
    public static void main(String[] args) {
//        Animal a=new Animal();
        Lion l=new Lion();
    }
}
class Animal{
    Animal(){
        System.out.println("Constructor of Animal");
    }
    static {
        System.out.println("static initializer_block in Animal");
    }
    {
        System.out.println("non-static initializer_block in Animal");
    }
}
class Mammal extends Animal{
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static {
        System.out.println("static initializer_block in Mammal");
    }
    {
        System.out.println("non-static initializer_block in Mammal");
    }
}
class Lion extends Mammal{
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static {
        System.out.println("static initializer_block in Lion");
    }
    {
        System.out.println("non-static initializer_block in Lion");
    }
}