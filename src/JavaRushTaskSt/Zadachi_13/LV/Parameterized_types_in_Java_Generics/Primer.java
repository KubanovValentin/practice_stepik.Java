package JavaRushTaskSt.Zadachi_13.LV.Parameterized_types_in_Java_Generics;

import java.util.ArrayList;

/*
Под дженериками в Java подразумевают возможность добавлять к типам типы-параметры.
Таким образом получаются сложные составные типы. Такой составной тип в общем случае выглядит так:

ОсновнойТип<ТипПараметр>
 */
public class Primer {
    //Все вместе — это именно тип. И он может использоваться там, где обычно можно использовать типы.
    public static void main(String[] args) {
        ArrayList<Integer> list;//Создание переменных
        list = new ArrayList<Integer> ();//	Создание объектов
        ArrayList<Integer>[] array;//Создание массивов

        //В такую коллекцию можно сохранить только переменные типа Integer:
        ArrayList<Integer> list1 = new ArrayList<Integer>();//Коллекция типа ArrayList с элементами типа Integer
        list.add(new Integer(1));//Так можно
        list.add(2);//И так можно: сработает autoboxing

 //       list.add("Привет");//А так нельзя: ошибка компиляции
        ArrayList<Integer> list3 = new ArrayList<Integer>();    //ArrayList list = new ArrayList();
        list3.add(1);                                           //list.add( (Integer) 1 );
        list3.add(13);
       int x = list3.get(1);                                    //int x = (Integer) list.get(1);
        list3.set(1, 10);                                       //list.set(1, (Integer) 10);
        list3.add(3);
        list3.add(1);

        int x1 = list3.get(2);
        System.out.println(list3);
        System.out.println(x);
    }
}
