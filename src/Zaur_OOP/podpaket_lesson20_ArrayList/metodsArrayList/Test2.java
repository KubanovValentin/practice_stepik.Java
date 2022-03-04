package Zaur_OOP.podpaket_lesson20_ArrayList.metodsArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder>list=new ArrayList<StringBuilder>();
        StringBuilder sb1=new StringBuilder("hello");
        StringBuilder sb2=new StringBuilder("privet");
        StringBuilder sb3=new StringBuilder("ok");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.set(0,new StringBuilder("stop"));
        list.add(3,new StringBuilder("Valentin"));

        for (int i=0;i< list.size();i++){
            list.get(i).append("!!!");
        }
        for (StringBuilder sb:list){
            System.out.print(sb+" ");
        }
        System.out.println();
        list.remove(2);
        list.remove(sb2);
        for (StringBuilder sb:list){
            System.out.print(sb+" ");
        }


    }
}
