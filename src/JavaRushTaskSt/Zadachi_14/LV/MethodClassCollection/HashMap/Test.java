package JavaRushTaskSt.Zadachi_14.LV.MethodClassCollection.HashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Серега", 21);
        map.put("Николай", 22);
        map.put("Иван Петрович", 48);
        map.put("Анюта", null);
//Компактная запись
        for (String key: map.keySet())
        {
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }
//Длинная запись
/*
        Set<String> keys = map.keySet();

        for (String key: keys)
        {
           Integer value = map.get(key);
           System.out.println(key + " --> " + value);
        }
* */
    }
}
