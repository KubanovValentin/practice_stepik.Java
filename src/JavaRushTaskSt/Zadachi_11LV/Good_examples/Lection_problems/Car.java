package JavaRushTaskSt.Zadachi_11LV.Good_examples.Lection_problems;
/*
Давай создадим каталог новых моделей авто у нас на производстве.
 Для этого нам нужно создать один метод initialize, который будет инициализировать такие поля объекта типа Car:
 модель, год выпуска, цвет.
 */
public class Car {
    private String model;
    private int year;
    private String color;
    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

}
