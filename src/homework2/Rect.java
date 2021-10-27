package homework2;

public class Rect {
    double aRect;
    double bRect;


    void param (double aRect, double bRect){
        this.aRect=aRect;
        this.bRect=bRect;
    }


    void perRect(){
        double result=2*(aRect+bRect);
        System.out.println(result);
    }

    double sqr (){
        return aRect*bRect;
    }


}
