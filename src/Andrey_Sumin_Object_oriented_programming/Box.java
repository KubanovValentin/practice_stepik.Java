package Andrey_Sumin_Object_oriented_programming;

public class Box {
    double width;
    double height;
    double length;

//-----------------------
    //конструктор без параметров
//    Box () {
//        width = 10;
//        height =10;
//        length =10;
//        //после этого создаем новую box в main
//    }
//-------------------------
    //конструктор с параметрами
//    Box(double width, double height, double length) {
//        this.width = width;
//        this.height = height;
//        this.length = length;
//    }
//-----------------------------
//нанажимаем клавиши Alt + Insert и вызываем меню
//выбираем конструктор

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
//--------------------------------
    void setDimens(double width, double height, double length) {
       this.width = width;
        this.height = height;
        this.length = length;
    }
//    void showVolume() {
//        double volume = width * height * length;
//        System.out.println(volume);
//    }

    double volume() {
        return width * height * length;
    }
}
