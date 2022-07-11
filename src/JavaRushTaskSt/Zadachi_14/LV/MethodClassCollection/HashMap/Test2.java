package JavaRushTaskSt.Zadachi_14.LV.MethodClassCollection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;


public class Test2 {
    //-------------------------
    //Код с ArrayList<String>
    //    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//
//        list.add("Привет");
//        list.add("Hello");
//
//        String s = list.get(0);
//        list.set(0, s + "!");
//
//        for (String item: list)
//        {
//            System.out.println(item);
//        }
//    }
    //----------------------------------------
     //Код с HashMap<Integer, String>
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Привет");
        map.put(1, "Hello");

        String s = map.get(0);
        map.put(0, s + "!");

        for (String item : map.values()) {
            System.out.println(item);
        }
    }
}
