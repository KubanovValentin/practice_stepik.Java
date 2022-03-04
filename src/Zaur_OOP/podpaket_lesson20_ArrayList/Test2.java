package Zaur_OOP.podpaket_lesson20_ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("A");
        StringBuilder sb2=new StringBuilder("B");
        StringBuilder sb3=new StringBuilder("C");
        ArrayList<StringBuilder>list=new ArrayList<StringBuilder>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (StringBuilder sb:list){
            System.out.println(sb+" ");
        }
        ArrayList<StringBuilder>list2=(ArrayList<StringBuilder>) list.clone();
        System.out.println(list==list2);
        System.out.println(list.get(0)==list2.get(0));
        System.out.println(list.equals(list2));

        list.get(0).append("!!!");
        System.out.println(list2.get(0));
    }
}
