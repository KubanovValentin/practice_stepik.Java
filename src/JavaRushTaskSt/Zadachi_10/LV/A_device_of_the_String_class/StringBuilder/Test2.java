package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.StringBuilder;

public class Test2 {
    /*
    Полезные примеры работы со строками
    Как развернуть строку задом наперед?
    Для этой операции есть специальный метод — reverse(); Пример:

    String str = "Привет";                             //тевирП
    StringBuilder builder = new StringBuilder(str);
    builder.reverse();
    String result = builder.toString();
    System.out.println(result);

     */
    public static void main(String[] args) {
        String str = "Привет";
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String result = builder.toString();
        System.out.println(result);
    }
}
