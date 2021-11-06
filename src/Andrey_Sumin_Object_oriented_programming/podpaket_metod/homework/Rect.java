package Andrey_Sumin_Object_oriented_programming.podpaket_metod.homework;

public class Rect {
    double height;
    double length;
//1.
    void paramRect(double height,double length){
        this.height=height;
        this.length=length;
    }
//2.
    double perimtr(){
        double result=2*(height+length);
        return result;
    }
//3.

    double sRect(){
        double result=height*length;
        return result;
    }
}
class Main{
    public static void main(String[] args) {
        //1.
        Rect rect=new Rect();
        rect.paramRect(15,20);
        System.out.println(rect.height+" "+ rect.length);
        //2.
        System.out.println(rect.perimtr());
        //3.
        System.out.println(rect.sRect());
    }
}