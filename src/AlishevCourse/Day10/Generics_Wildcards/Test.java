package AlishevCourse.Day10.Generics_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal>listOfAnimal=new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));


        List<Dog>listOfDogs=new ArrayList<>();
        listOfDogs.add(new Dog(3));
        listOfDogs.add(new Dog(4));

        test(listOfAnimal);
        test(listOfDogs);

//        Object object = new Object();
//        object.
    }

//    private static void test(Animal animal){
//
//    }
        /*
        иерархия классов
        Object
        Animal
        Dog


        (List<? extends Animal>list)
        (если  extends то ниже Animal ->  Dog)
        (если  super то выше Animal <- Object)
        */

    private static void test(List<? extends Animal>list){
        for (Animal animal:list){
            animal.eat();
            System.out.println(animal);
        }
    }
}
