package JavaRushTaskSt.Zadachi_13.LV.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
/*
В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

Требования:
•	В методе main должен удаляться Pascal из списка programmingLanguages.
 */
public class Solution5 {
    public static ArrayList<String> programmingLanguages =
            new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
//       programmingLanguages.remove(6);
//       System.out.println(programmingLanguages);

        for (int i = 0; i < programmingLanguages.size(); i++) {
            if (programmingLanguages.get(i).equals("Pascal")) {
                programmingLanguages.remove(i);
                break;
            }
        }
       for (String s:programmingLanguages){
           System.out.print(s+" ");
       }
    }
}
