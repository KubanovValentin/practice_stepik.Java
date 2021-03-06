package JavaRushTaskSt.Zadachi_4.LV_cycle;

import java.util.Scanner;

/*
Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
Поэтому сделаем конвертер величин скорости из м/с в км/ч.
Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
Для округления необходимо использовать метод Math.round().
 */
public class Solution16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int windSpeedMetre= sc.nextInt();
        int windSpeedKilometer=(int)Math.round(windSpeedMetre*3.6);
        System.out.println(windSpeedKilometer);
    }
}
