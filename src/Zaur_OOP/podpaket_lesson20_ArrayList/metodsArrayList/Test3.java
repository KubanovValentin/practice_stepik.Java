package Zaur_OOP.podpaket_lesson20_ArrayList.metodsArrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();
        list.clear();
        for (String s : list) {
            System.out.print(s + " .");
        }

    }
}
