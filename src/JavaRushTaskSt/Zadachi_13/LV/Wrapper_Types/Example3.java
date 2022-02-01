package JavaRushTaskSt.Zadachi_13.LV.Wrapper_Types;

public class Example3 {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        System.out.println(a == b);

        //Переменные a и b хранят не значения (как типы int),
        // а ссылки на объекты. Поэтому важно помнить, как правильно их сравнивать:

        Integer a1 = 1000;
        Integer b1 = 1000;

        System.out.println(a1.equals(b1));
    }
}
