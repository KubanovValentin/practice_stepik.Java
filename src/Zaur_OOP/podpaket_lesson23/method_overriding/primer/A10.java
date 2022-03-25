package Zaur_OOP.podpaket_lesson23.method_overriding.primer;

public class A10 {
    String s1 = "privet";
    static double d = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}
class B10 extends A10{
    String s1=super.s1+", drug!";
    double d=super.d;

    int summa(int... i) {
        int result = super.summa(i);
        System.out.println("summa: "+result);
        super.abc();
        return result;
    }



    public static void main(String[] args) {
        B10 b=new B10();
        System.out.println(b.s1);
        System.out.println(b.d);

    }

}