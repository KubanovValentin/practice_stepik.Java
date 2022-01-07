package JavaRushTaskSt.Zadachi_8.LV.Objects;

//Знакомство с классами
/*
Программисты обычно создают свои классы, когда хотят ввести в программу новую сущность.
Звучит не очень понятно? Тогда попробую объяснить, но начну издалека.
 */
public class Test2 {
    public static void printPoints(Point[] points) {
        for (int i = 0; i < points.length; i++)
            points[i].print();
    }

    public static void main(String[] args){
        Point[] data = new Point[100];
        for (int i = 0; i < data.length; i++)
            data[i] = new Point();
        printPoints(data);
    }
}

/*
Мы красиво спрятали внутрь точки (класс Point) информацию о ее координатах и метод,
который выводит состояние объекта-точки на экран.
 */
class Point {
    public int x;
    public int y;
    public int color;

    public void print() {
        System.out.println("Цвет точки x=" + x + ", y=" + y + " " + color);
    }
}