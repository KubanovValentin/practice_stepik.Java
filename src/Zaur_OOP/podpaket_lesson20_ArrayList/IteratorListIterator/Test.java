package Zaur_OOP.podpaket_lesson20_ArrayList.IteratorListIterator;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list=new ArrayList<String>();
        list.add(s4);
        list.add(s2);
        list.add(s3);
        list.add(s1);
    //iterator-это повторитель
        Iterator<String>it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
//           it.next();
//           it.remove();
//           System.out.println(it.next());
        }
    }
}
