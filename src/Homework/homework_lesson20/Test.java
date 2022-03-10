package Homework.homework_lesson20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public ArrayList<String> abc(String... s) {
        ArrayList<String> aL = new ArrayList<>();//создаем массив
        for (String s1 : s) { //добавляем
            //проверяем на добавление есть ли в этом списке(если есть то не добавляем)
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);//сортируем как в тз
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.abc("privet", "ok", "poka", "privet", "kak dela?", "ok", "hello");
    }
}
