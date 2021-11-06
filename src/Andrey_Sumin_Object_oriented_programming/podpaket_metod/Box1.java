package Andrey_Sumin_Object_oriented_programming.podpaket_metod;

public class Box1 {
    double width;
    double height;
    double length;

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
