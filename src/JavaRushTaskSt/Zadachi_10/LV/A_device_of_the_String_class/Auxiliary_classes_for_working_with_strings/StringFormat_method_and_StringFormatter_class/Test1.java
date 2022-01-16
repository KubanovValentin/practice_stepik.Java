package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.
        Auxiliary_classes_for_working_with_strings.StringFormat_method_and_StringFormatter_class;

//String.format
public class Test1 {
    private static String name = "Amigo";
    private static int age = 12;
    private static String fullname = "Diego";
    private static int height = 10;
    private static int width = 20;
    public static String info1 = String.format("Age=%d, Name=%s", age, name);
    public static String info2 = String.format("Width=%d, Height=%d", width, height);
    public static String info3 = String.format("Fullname=%s", fullname);

    public static String s = String.format("a=%d, b=%d, c=%d", 1, 4, 3);
    public static String s1 = String.format("a=%3$d, b=%2$d, c=%d", 11, 12, 13);
    //String имя = String.format(шаблон, параметры);
    public static void main(String[] args) {
        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info3);
        System.out.println(s);
        System.out.println(s1);
        /*
        В метод format() первым параметром передают строку-шаблон, которая содержит весь нужный текст,
        а в местах, где нужно вставлять данные, написаны специальные символы типа %d, %s и т.п.

        ----------------------------

        Вот эти %s и %d метод format() и заменяют на параметры, которые идут следом за строкой-шаблоном.
        Если нужно подставить строку, мы пишем %s, если число — %d. Пример:
         */

    }

}