package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.StringBuilder;

public class Test {
    /*
     Краткое описание методов
   ---------------------------
    !
    Добавление к строке
    Чтобы что-то добавить к изменяемой строке (StringBuilder), нужно воспользоваться методом append(). Пример:

    StringBuilder builder = new StringBuilder("Привет");//Привет
    builder.append("Пока");//ПриветПока
    builder.append(123);//ПриветПока123

    ----------------------------
    !
    Преобразование к стандартной строке
    Чтобы преобразовать объект StringBuilder к строке типа String,
    нужно просто вызвать у него метод toString(). Пример

    StringBuilder builder = new StringBuilder("Привет");//Привет123
    builder.append(123);
    String result = builder.toString();
    System.out.println(result);


    ----------------------------
    !

    Как удалить символ?
    Чтобы удалить символ в изменяемой строке, вам нужно воспользоваться методом deleteCharAt(). Пример:

    StringBuilder builder = new StringBuilder("Привет");//Првет
    builder.deleteCharAt(2);
    String result = builder.toString();
    System.out.println(result);


    ----------------------------
    !

    Как заменить часть строки на другую?
    Для этого есть метод replace(int begin, int end, String str). Пример:

    StringBuilder builder = new StringBuilder("Привет");//ПрHello!т
    builder.replace(2, 5, "Hello!");
    String result = builder.toString();
    System.out.println(result);



     */
}
