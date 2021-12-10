package AlishevCourse.Day10.Anonymous_classes;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

//    OtherAnimal otherAnimal=new OtherAnimal();
//    otherAnimal.eat();

        //создается анонимный класс и переопределяет метод
        //лежит наследник класса Animal(не объект)
        Animal animal2 = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating....");
            }
        };
        animal2.eat();
    }
}

//class OtherAnimal extends Animal{
//    public void eat() {
//        System.out.println("Other animal is eating....");
//    }
//}


class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}