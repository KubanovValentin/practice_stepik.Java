package Andrey_Sumin_Object_oriented_programming.podpaket_MethodOverriding.constructor;

public class Box {
    double width;
    double height;
    double length;


    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }
//2.создаем пустой конструктор
    Box(){
        width=0;
        height=0;
        length=0;
    }

    //создаем новый метод который  будет присваивать значение но возращать не будет
    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    double volume() {
        return width * height * length;
    }


//1.создаем метод и вызываем в майне
    void showVolume(){
        double volume=width * height * length;
        System.out.println(volume);
    }
}
