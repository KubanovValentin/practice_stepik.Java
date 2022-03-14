package Homework.homework_lesson22_OOP;

public class TestZaur2 {
}
class AnimalZaur{
    public AnimalZaur() {
        System.out.println("I am animal");
    }
    int eyes;
    public void eat() {
        System.out.println("Animal eats");
    }
    public void drink() {
        System.out.println("Animal drinks");
    }
}
class PetZaur extends AnimalZaur{
    PetZaur() {
        System.out.println("I am pet");
        eyes=2;
    }
    String name;
    int tail=1;
    int paw=4;
    public void run(){
        System.out.println("Pet run");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }
}
class DogZaur extends PetZaur{
     DogZaur(String name) {
        this.name=name;
         System.out.println("I am dog and my name is: "+name);
    }
    public void play(){
        System.out.println("Dog plays");
    }
}
class CatZaur extends PetZaur{
    public CatZaur(String name) {
        this.name=name;
        System.out.println("I am cat and my name is: "+name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
class AnimalZaurTest{
    public static void main(String[] args) {
        DogZaur dog=new DogZaur("Baron");
        System.out.println("Количество лап у собаки: "+dog.paw);
        CatZaur cat=new CatZaur("Tosha");
        cat.sleep();
    }
}