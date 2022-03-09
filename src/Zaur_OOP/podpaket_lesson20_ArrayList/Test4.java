package Zaur_OOP.podpaket_lesson20_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class Test4 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String>list=new ArrayList<String>();
        list.add(s4);
        list.add(s2);
        list.add(s3);
        list.add(s1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
