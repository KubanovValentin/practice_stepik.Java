package Andrey_Sumin_Object_oriented_programming.podpaket_accessModifier.Main;


import Andrey_Sumin_Object_oriented_programming.podpaket_accessModifier.Box.Box;
import Andrey_Sumin_Object_oriented_programming.podpaket_accessModifier.Test.Man;




public class Main {
    public static void main(String[] args) {
        //создаем нового человека
        Man man=new Man("Вася",16);
        Box box=new Box();
//        man.age=-40;
        //это не должно так полчиться,а получилось потому что у нас есть доступ к полям
        //довать доступ к полям очень плохая практика(называеться нарушение инкапсуляции)
        //чтоб исправить это сменим доступ public на private
//        man.setAge(-40);
//        System.out.println(man.getAge());
//        System.out.println(man.getName());
//        man.showInfo();
    }
}
