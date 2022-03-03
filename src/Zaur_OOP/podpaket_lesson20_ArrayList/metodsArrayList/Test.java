package Zaur_OOP.podpaket_lesson20_ArrayList.metodsArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //метод add
        ArrayList<String> list = new ArrayList<String>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(6);
        integers.add(9);
        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println();

        //--------------------
        //метод get
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+"! ");
        }
        System.out.println();
        System.out.println(list.get(3));
        System.out.println();

        //-------------------
        //метод set
        list.set(2,"!!!");
        for (String s:list){
            System.out.print(s+" ");
        }
        System.out.println();

        //-------------------
        //метод set
    }
}
