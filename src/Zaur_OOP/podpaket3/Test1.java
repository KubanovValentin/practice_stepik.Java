package Zaur_OOP.podpaket3;

public class Test1 {
//    public  final int a = 10; //меняться не сможет при final но использовать можем

//    public  int a;                    //  дефолтное значение
    public  final int a; //инстанс переменная
    public static int ab=10;
    //сделаем 2 конструктора
    Test1(){
        a=10;
    }
    Test1(boolean b){
        a=15;
    }
    //метод
    public void abc(short s){
        final byte b;//локальная переменная
        b=10;
        System.out.println(s+b);
    }
    public static void main(String[] args) {
        Test1 t=new Test1();
//        t.a=t.a * 2;
        System.out.println(t.a);
    }
}
