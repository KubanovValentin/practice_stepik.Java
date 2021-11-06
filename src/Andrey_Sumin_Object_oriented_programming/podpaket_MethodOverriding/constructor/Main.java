package Andrey_Sumin_Object_oriented_programming.podpaket_MethodOverriding.constructor;

public class Main {
    public static void main(String[] args) {
        //создаем коробку,и если мы хотим создать куб то выбираем нужный конструктор
        Box  box=new Box(10);
        //если хотим коробку с разной величиной то берем другой конструктор
        Box box1=new Box(10,20,15);
        //1.напишем метод который будет выводить размеры наших коробок
        //1.выводим метод
        box.showVolume();
        box1.showVolume();

        //2.мы можем создать и пустой конструктор
        //2.и после создания конструктора создаем коробку данного конструктора
        //чтоб понять какой конструктор можно нажать ctrl+p и тогда види сколько есть конструкторов
        Box box2=new Box();
        box2.showVolume();
    }

}
