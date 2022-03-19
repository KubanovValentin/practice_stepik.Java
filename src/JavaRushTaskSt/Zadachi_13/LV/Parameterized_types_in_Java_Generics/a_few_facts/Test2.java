package JavaRushTaskSt.Zadachi_13.LV.Parameterized_types_in_Java_Generics.a_few_facts;

import java.util.ArrayList;

public class Test2 {
    //Также сложные типы тоже можно использовать в качестве параметров. Выглядит это примерно так:
//ОсновнойТип<ТипПараметр<ТипПараметрПараметра>>
    public static void main(String[] args) {
        // список приветствий
        ArrayList<String> listHello = new ArrayList<String>();
        listHello.add("Привет");
        listHello.add("Hi");

        // список прощаний
        ArrayList<String> listBye = new ArrayList<String>();
        listBye.add("Пока");
        listBye.add("Good Bye");

        // список списков
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
        lists.add(listHello);
        lists.add(listBye);
        System.out.println(lists);
    }
}
