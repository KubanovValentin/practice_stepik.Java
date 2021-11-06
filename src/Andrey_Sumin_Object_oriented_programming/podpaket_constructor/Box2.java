package Andrey_Sumin_Object_oriented_programming.podpaket_constructor;

public class Box2 {
    double width;
    double height;
    double length;
    //создаем конструктор без параметров
    //это шаблон для всех создающихся Box
    Box2(){
        width=10;
        height=10;
        length=10;
    }
    //создаем конструктор c параметрами
    Box2(double width,double height,double length){
        this.width=width;
        this.height=height;
        this.length=length;
    }

    //создаем новый метод который  будет присваивать значение но возращать не будет
    void setDimens(double width,double height,double length){
        this.width=width;
        this.height=height;
        this.length=length;

    }

    double volueme(){
        return width*height*length;
    }
}
