package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.Auxiliary_classes_for_working_with_strings.StringFormat_method_and_StringFormatter_class;
/*
Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==.
Нужно сделать так, чтобы метод возвращал true, если содержимое строк одинаковое, и false — если разное, не используя метод equals().


 */
public class Solution2 {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //напишите тут ваш код
        return first.intern() == second.intern();
    }
}
