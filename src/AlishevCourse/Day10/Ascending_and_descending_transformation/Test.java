package AlishevCourse.Day10.Ascending_and_descending_transformation;

public class Test {
    public static void main(String[] args) {
//        Animal animal=new Animal();
//        animal.eat();
//        Dog dog=new Dog();
//        dog.bark();
//        dog.eat();

//------------------------------------------------------------------------
        //Upcasting-восходящее преобразование (от наследника к родителю)
        // теперь Dog рассматриваем как Animal

//        Animal animal=new Dog();

        //можно сделать и так-собаку сделать животным
        Dog dog=new Dog();
        //неявное преобразование Upcasting
        Animal animal=dog;


//------------------------------------------------------------------------


        // Downcasting-нисходящее преобразование
        //явное преобразование
        // не всегда безопасен
        Dog dog2=(Dog) animal;
        dog2.bark();
    }
}
