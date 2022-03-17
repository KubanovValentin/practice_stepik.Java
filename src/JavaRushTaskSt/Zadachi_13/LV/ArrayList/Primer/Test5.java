package JavaRushTaskSt.Zadachi_13.LV.ArrayList.Primer;

import java.util.ArrayList;

/*
Допустим, вам нужно удалить 3 последних элемента списка.

Как это сделать неправильно:
 */
public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); //Создаем объект-список

        for (int i = 1; i <= 20; i++)              //в списке 10 элементов: 2, 4, 6, ... 20
            if (i % 2 == 0)
                list.add(i);

        int n = list.size();                        //n = 10
        list.remove(n - 3);                   //n - 3 = 7 (в списке осталось 9 элементов)
        list.remove(n - 2);                  //n - 2 = 8 (в списке осталось 8 элементов)
        list.remove(n - 1);                  //n - 1 = 9 (в списке осталось 7 элементов)

//        for (int i = 0; i < list.size(); i++)
//            System.out.println(list.get(i));
    }
}
