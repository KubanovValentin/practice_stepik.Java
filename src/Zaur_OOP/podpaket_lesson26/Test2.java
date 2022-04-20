package Zaur_OOP.podpaket_lesson26;

public class Test2 {
    static void abc(String s){
        System.out.println("String s");
    }
    static void abc(String ... s){
        System.out.println("String ... s");
    }
    static void abc(Object s){
        System.out.println("Object s");
    }
    static void abc(String s1,String s2){
        System.out.println("String s1,String s2");
    }
    static void qwe(Long l){
        System.out.println("Long l");
    }
    static void qwe(Long ...l){
        System.out.println("(Long ...l");
    }

    public static void main(String[] args) {
        Test2 t2=new Test2();
        t2.abc("ok");//закоментим ->static void abc(String s) ->static void abc(Object s)->static void abc(String ... s)
        t2.abc("by","!");//закоментим->static void abc(String s1,String s2)->  static void abc(String ... s)
        t2.abc("by","!","werwerw");//static void abc(String ... s)

        System.out.println("--------------------------");
        t2.qwe(50l);//компилятор пропустит только с 50l<-l(50) нет(надо указать лонг)
    }
}
