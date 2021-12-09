package AlishevCourse.Day10.Casting_primitive_data_types;

public class Test {
    public static void main(String[] args) {
    //примитивные хранят в себе данные(значения)
//        byte x=123;
//        short sh=123;
//        int i=23;
//        long l=1235354534L;
//        double a=12.3;
//        float fl=2323.4f;

        //конвертируем
        int a =123;
        long l=a;// неявное
       int x=(int)l;//явное

       double d=123.56;
       int b=(int) d;
        System.out.println(b);

        long l1=Math.round(d);
        System.out.println(l1);



    }
}
