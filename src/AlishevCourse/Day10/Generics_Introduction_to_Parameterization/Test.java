package AlishevCourse.Day10.Generics_Introduction_to_Parameterization;

import AlishevCourse.Day9.Polymorphism.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ////////////java5/////////////
        List animals=new ArrayList();
        Animal ourAnimal=new Animal();
        animals.add("cat");
        animals.add("dog");//1 индекс
        animals.add("frog");
        animals.add(ourAnimal);
        //теперь получим эти значения
        // применим Downcast
        String animal=(String) animals.get(1);
        System.out.println(animal);

        ////////////с появлением Generics/////////////
        List<String> animals2=new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");//1 индекс
        animals2.add("frog");
//        animals2.add(ourAnimal);


        String animal2= animals2.get(1);


        ////////////java7/////////////
        List<String> animal3=new ArrayList<>();
    }
}
class Animal2{

}