package JavaRushTaskSt.Zadachi_8.LV.Reference_variables;

public class Test {
    public static String name;//Переменная String name имеет значение по умолчанию: null.
    public static int age;//Переменная int age имеет значение по умолчанию: 0.



    public static void main(String[] args) {
        String s = null; //s хранит ссылку null.
        s = "Привет"; //s хранит ссылку на объект-строку
        s = null; //s хранит ссылку null
    }
}
