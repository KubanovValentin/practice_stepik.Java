package JavaRushTaskSt.Zadachi_13.LV.Parameterized_types_in_Java_Generics.a_few_facts;

import java.util.ArrayList;
import java.util.HashMap;
//У классов может быть не один тип параметр, а несколько. Выглядит это примерно так:
//ОсновнойТип<ТипПараметр1, ТипПараметр2, ТипПараметр3>
public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//первый параметр метода put имеет тип Integer,
                                                                     // второй — тип String
        map.put(7, "Привет");
        map.put(-15, "Привет");
    }
}


