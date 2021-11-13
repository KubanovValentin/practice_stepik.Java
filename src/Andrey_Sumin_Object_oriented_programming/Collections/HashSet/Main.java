package Andrey_Sumin_Object_oriented_programming.Collections.HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //она используеться тогда когда мы хотим чтоб небыло повторяющихся значений
        HashSet<String>names=new HashSet<>();
        names.add("Jon");
        names.add("Jack");
        names.add("Molly");
        names.add("Maks");
        names.add("Olga");
//если мы добавим одинаковое имя
        names.add("Molly");
        //то HashSet выводит только одно имя т.к он хранит по 1 экземпляру элементов
        //при выводе на экран или добавлении то меняеться позиция элементов
        // и значит мы не можем обращаться к ним через get
        //выведим все значения

        for (String name:names) {
            System.out.println(name);
        }
    }
}
