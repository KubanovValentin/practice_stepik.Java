package Zaur_OOP.podpaket_lesson20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.print(o + " ");
        }
        System.out.println();
        StringBuilder[] array2 = list.toArray(new StringBuilder[10]);
        for (StringBuilder sb : array2) {
            System.out.print(sb + " ");
        }
        System.out.println();
//        for (int i=0;i< array2.length;i++){
//            System.out.print(array2[i].toString());
//        }

        StringBuilder[]array3={sb2,sb3,sb2,sb3};
        List<StringBuilder>list8= Arrays.asList(array3);
        System.out.println(list8);
        array3[0].append("!");
        System.out.println(list8);

    }
}
