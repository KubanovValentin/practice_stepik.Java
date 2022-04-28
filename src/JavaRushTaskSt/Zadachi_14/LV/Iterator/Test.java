package JavaRushTaskSt.Zadachi_14.LV.Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    //Iterator<Тип> it = имя.iterator();
    //Где имя — это имя переменной-коллекции, Тип — это тип элементов коллекции.
    // iterator() — это метод коллекции. it — это имя переменной-объекта-итератора.
    /*
    У объекта-итератора есть 3 метода:
    Тип next()-->Возвращает очередной элемент коллекции
    boolean hasNext()-->Проверяет, есть ли еще не пройденные элементы
    void remove()-->Удаляет текущий элемент коллекции
     */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();//Создаем объект типа HashSet, который хранит элементы типа String.

        //Заносим в set приветствия на разных языках.
        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Cialo");
        set.add("Namaste");

        Iterator<String> it = set.iterator();//Получаем объект-итератор у множества set.
        while (it.hasNext()) {               //Пока есть еще элементы
            String str = it.next();          //Получаем следующий элемент
            System.out.println(str);         //Выводим элемент на экран
        }
    }
}
