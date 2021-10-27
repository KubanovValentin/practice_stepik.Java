package homework2;

public class Main {
    public static void main(String[] args) {
        Rect rect =  new Rect();
//        rect.aRect=15.5;
//        rect.bRect=34.8;

//        rect.perRect();
//        System.out.println(rect.sqr());

        rect.param(15.5,34.8);
        System.out.println(rect.aRect+","+ rect.bRect);
        System.out.println(rect.sqr());
        rect.perRect();
    }
}
