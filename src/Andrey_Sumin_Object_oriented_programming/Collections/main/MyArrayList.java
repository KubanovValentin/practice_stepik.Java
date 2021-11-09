package Andrey_Sumin_Object_oriented_programming.Collections.main;

public class MyArrayList {
    //создаем изначальный массив
    private String[] array = new String[10];
    //создаем переменную size которая будет хранить кол-во элементов
    private int size = 0;

    //создаем метод добавления элементов add(он ничего не возращает)
    public void add(String s) {
        array[size] = s;
        //в массиве нет еще не одного элемента size=0
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            //теперь копируем все элементы из1 массива во 2
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            //теперь мы присваиваем значение нового массива нашему
            array = newArray;
        }
    }

    //теперь метод удления элементов
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index!=-1){
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "элемент не найден";
        }
    }
}
