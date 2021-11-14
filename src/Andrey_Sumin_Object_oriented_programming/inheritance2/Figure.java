package Andrey_Sumin_Object_oriented_programming.inheritance2;

public class Figure {
    public int a;
    public int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void sqr(){
        int result=2*(a+b);
        System.out.println(result);
    }
}
