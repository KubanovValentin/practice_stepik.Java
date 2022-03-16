package JavaRushTaskSt.Zadachi_13.LV.ArrayList.Primer;

import java.util.ArrayList;

public class Test2 {
    //Занесём в список все четные числа от 1 до 20:
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//Создаем объект-список

        for (int i = 1; i <= 20; i++){                     //цикл по всем числам 1 .. 20
            if (i%2 == 0)                                  //если число делится на 2 без остатка,
                list.add(i);                               //добавить его в список
        }
        System.out.println(list);

    }
}
