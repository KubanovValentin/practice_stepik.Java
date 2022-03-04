package Zaur_OOP.podpaket_lesson20_ArrayList.metodsArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list=new ArrayList<StringBuilder>();
        list.add(new StringBuilder("hello"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("poka"));
        for (StringBuilder sb:list){
            System.out.print(sb+" ");
        }
        System.out.println();
        System.out.println(list.indexOf(new StringBuilder("poka")));
    }
}
