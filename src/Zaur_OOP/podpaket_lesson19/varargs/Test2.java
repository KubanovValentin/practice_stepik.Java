package Zaur_OOP.podpaket_lesson19.varargs;

public class Test2 {
    static void summa(String s,int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
//        System.out.println(summa);
//        System.out.println(s);

        System.out.println(s+"-"+summa);
    }
    //правило-пишется после всех типов самым последним и только один varargs
    public static void main(String[] args) {
//        summa("hello",1,2);
//        summa("ok", 7, 4);
        summa("можно написать и массив в varargs",new int[]{1,6,3,9,});
    }
}
