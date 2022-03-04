package Zaur_OOP.podpaket_lesson20_ArrayList.metodsArrayList;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(new String("poka"));
        list.add(new String("hello"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("poka"));
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.indexOf(new String("poka")));
        System.out.println(list.lastIndexOf(new String("poka")));
        System.out.println("длина list равна " + list.size());
        System.out.println(list.isEmpty());
        System.out.println("наш list содержит объект 'ок!' - "+list.contains("ok!"));
        System.out.println(list.toString());
    }
}
