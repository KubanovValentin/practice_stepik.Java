package Homework.homework5;

public class Zadacha2 {
    //создаем константу
    public final static double PI = 3.14;

    public double ploshad(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }

    //static метод
    public static double dlina(double radius2) {
        double d1 = 2 * PI * radius2;
        return d1;
    }

    //non-static метод
    public void info(double radius3) {
        System.out.println("радиус = " + radius3);
        System.out.println("площадь круга = " + ploshad(radius3));
        System.out.println("длина окружности = " + dlina(radius3));
    }
}

class Zadacha2Test {
    public static void main(String[] args) {
        //используем все три метода

        Zadacha2 z = new Zadacha2();
        z.ploshad(5);
        Zadacha2.dlina(7.5);
        z.info(3);

    }
}