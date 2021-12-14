package AlishevCourse.Day10.Equals_method_and_String_Pool;

public class Test {
    public static void main(String[] args) {
//        int x=1;
//        int y=1;
//        System.out.println(x==y);//сравнение примитивов
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

//        System.out.println(animal1==animal2);//сравниваются ссылки объектов и для ссылочных типов не работает
        //указатель____________объект
        //animal1       -->     {1}
        //animal2        -->    {1}

        //создем родителя всех классов и у него есть метод сравнения объектов
//        Object object=new Object();
//        object.equals();
//     класс Animal наследник класса Object и поэтому он наследует метод equals()
//     сдесь так же идет сравнение
//
        System.out.println(animal1.equals(animal2));


    }
}

//сравним объекты по их структуре
class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}