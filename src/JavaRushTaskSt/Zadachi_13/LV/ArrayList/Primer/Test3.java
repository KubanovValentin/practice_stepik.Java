package JavaRushTaskSt.Zadachi_13.LV.ArrayList.Primer;

import java.util.ArrayList;

//А теперь выведем все элементы списка на экран:
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//Создаем объект-список
        for (int i = 1; i <= 20; i++)//цикл по всем числам 1 .. 20
            if (i%3 == 0)//если число делится на 3 без остатка
                          //добавить его в список
                list.add(i);

        for (int i = 0; i < list.size(); i++)//     цикл от нуля до размера списка
            System.out.println(list.get(i));//     выводим каждый элемент на экран
    }
}
