package Andrey_Sumin_Object_oriented_programming;

public class Box {
    double width;
    double height;
    double length;


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
