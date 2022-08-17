package Zaur_OOP.podpaket_lesson29.lambda_expressions_1;

public class Primer {
    static void def(Primer2 p2){
        System.out.println(p2.abc("hello"));
    }

    public static void main(String[] args) {
        def(x->x.length());
    }
}
interface Primer2{
    int abc(String s);
}