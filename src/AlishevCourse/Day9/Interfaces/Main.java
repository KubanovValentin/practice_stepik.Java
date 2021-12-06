package AlishevCourse.Day9.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Animal animal1=new Animal(1);
//        Person person1=new Person("Bob");
////        animal1.sleep();
////        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();

//        Info info1=new Animal(1);
//        Info info2=new Person("Bob");
//        info1.showInfo();
//        info2.showInfo();
//        outputInfo(info1);
//        outputInfo(info2);

        Animal animal1=new Animal(1);
        Person person1=new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}

class Animal implements Info{
    public  int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }
    public void showInfo(){
        System.out.println("Id is "+this.id);
    }
}

class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void showInfo(){
        System.out.println("Name is "+this.name);
    }
}