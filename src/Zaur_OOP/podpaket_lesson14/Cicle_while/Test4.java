package Zaur_OOP.podpaket_lesson14.Cicle_while;

public class Test4 {
    public static void main(String[] args) {
        int a=5;
        //6,7,8,9,10,11,12
        //сначала проверяем условие(a++<10) а потом прибавляем а++.поэтому результат 12
        while (a++<10){
            a++;

        }
        System.out.println(a);
    }
}
