package AlishevCourse.Day9.Zadachi.Task2;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //метод должен возвращать площадь фигуры
    public abstract double area();
    //метод должен возвращать периметр фигуры
    public abstract double perimeter();
}
