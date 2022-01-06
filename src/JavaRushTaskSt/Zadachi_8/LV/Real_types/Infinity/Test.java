package JavaRushTaskSt.Zadachi_8.LV.Real_types.Infinity;

public class Test {
    public static void main(String[] args) {
        //положительная бесконечность и отрицательная бесконечность.
        System.out.println( 100.0 / 0.0 );//Infinity
        System.out.println( -100.0 / 0.0 );//Infinity
        double a = 1d / 0d;//  a == Infinity
        double b = a * 10;//   b == Infinity
        double c = b - 100;//  c == Infinity



        //Не число (NaN)
        System.out.println(0.0 / 0.0);
        double infinity = 1d / 0d;
        System.out.println(infinity / infinity);
        double a1 = 0.0 / 0.0;//  a1 == NaN
        double b1 = a * 10;//   b1 == NaN
        double c1 = b - 100;//  c1 == NaN
        double d1 = a + infinity;//  d1 == NaN
    }
}
