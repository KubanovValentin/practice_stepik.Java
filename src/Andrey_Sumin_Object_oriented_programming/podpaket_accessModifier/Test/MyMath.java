package Andrey_Sumin_Object_oriented_programming.podpaket_accessModifier.Test;

public class MyMath {

    private static double PI = 3.14;

    public static int square(int number) {
        //возвращаем число в квадрате
        return number * number;
    }

    //создадим метод который принимает радиус а возращает длину окружности
    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
