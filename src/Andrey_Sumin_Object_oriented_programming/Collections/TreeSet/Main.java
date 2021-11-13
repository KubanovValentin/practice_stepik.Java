package Andrey_Sumin_Object_oriented_programming.Collections.TreeSet;


import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

            //она используеться тогда когда мы хотим чтоб небыло повторяющихся значений
            TreeSet<String> names=new TreeSet<>();
            names.add("Jon");
            names.add("Jack");
            names.add("Molly");
            names.add("Maks");
            names.add("Olga");
            //если мы добавим одинаковое имя
            names.add("Molly");
            //то TreeSet выводит только одно имя т.к он хранит по 1 экземпляру элементов
             //элементы храняться в отсортированном порядке
            // и значит мы не можем обращаться к ним через get

            //выведим все значения
            //только чере форич
            for (String name:names) {
                System.out.println(name);
            }
        }
    }

