package JavaRushTaskSt.Zadachi_14.LV.HashSet;
import java.util.Arrays;
import java.util.HashSet;
/*
В классе Solution есть метод checkWords(String), который должен проверять наличие переданного слова в множестве words.
Если слово есть, то выводим в консоль:
Слово [переданное слово] есть в множестве
Если нет:
Слова [переданное слово] нет в множестве

Метод main не участвует в проверке.

Пример вывода:
Слово Java есть в множестве

Требования:
•	В классе Solution должно быть публичное статическое поле words типа HashSet<String>.
•	В классе Solution должен быть публичный статический метод checkWords(String) с типом возвращаемого значения void.
•	Метод checkWords(String) должен работать согласно условию.
 */
import static java.util.Arrays.asList;
public class Solution2 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".
            split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println(String.format("Слово %s есть в множестве", word));
        } else {
            System.out.println(String.format("Слова %s нет в множестве", word));
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
