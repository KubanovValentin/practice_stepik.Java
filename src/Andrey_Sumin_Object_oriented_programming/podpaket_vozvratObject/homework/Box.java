package Andrey_Sumin_Object_oriented_programming.podpaket_vozvratObject.homework;

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

    Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    double volume() {
        return width * height * length;
    }

    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }

    Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }
}
class Main{
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(20,20,10);
        Box box3 = box1.sumBox(box2);
        Box box4 = new Box(box1, box3);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        double volumeSum = box1.volume() + box3.volume();
        System.out.println("box1 + box3 = " + volumeSum);
        box4.showVolume();
    }
}