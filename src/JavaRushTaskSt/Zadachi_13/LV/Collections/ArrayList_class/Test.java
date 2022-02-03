package JavaRushTaskSt.Zadachi_13.LV.Collections.ArrayList_class;

import java.util.ArrayList;

/*
Внутри каждого объекта типа ArrayList хранится обычный массив элементов. Когда вы считываете элементы из ArrayList,
он считывает их со своего внутреннего массива. Когда записываете — записывает их во внутренний массив.
 */
public class Test {
    //Создание объекта ArrayList --> ArrayList<Тип> имя = new ArrayList<Тип>();
    ArrayList<Integer> list1 = new ArrayList<Integer>();//Список целых чисел
    ArrayList<String> list2 = new ArrayList<String>();//Список строк
    ArrayList<Double> list3 = new ArrayList<Double>();//Список вещественных чисел
}
