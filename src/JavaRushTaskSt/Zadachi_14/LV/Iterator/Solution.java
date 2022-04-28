package JavaRushTaskSt.Zadachi_14.LV.Iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
В классе Solution есть метод print(HashSet<String>), который должен выводить в консоли все элементы множества,
используя iterator().
Метод main не участвует в проверке.

Требования:
•	В классе Solution должен быть публичный статический метод print(HashSet<String>) с типом возвращаемого значения void.
•	Метод print(HashSet<String>) должен работать согласно условию.
 */
public class Solution {
    public static void print(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
