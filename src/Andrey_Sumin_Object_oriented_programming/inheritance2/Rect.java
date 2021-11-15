package Andrey_Sumin_Object_oriented_programming.inheritance2;

public class Rect extends Figure{
    public Rect(double a,double b){
        super(a,b);
    }
    public Rect(double size){
        super(size,size);
    }


//ctri+I
    @Override
    public double area() {
        return getA()*getB();
    }

}
