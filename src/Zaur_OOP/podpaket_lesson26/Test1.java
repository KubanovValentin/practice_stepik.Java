package Zaur_OOP.podpaket_lesson26;

public class Test1 {
    void abc(int i){
        System.out.println("int");
    }
    void abc(byte i){
        System.out.println("byte");
    }
    void abc(long i){
        System.out.println("long");
    }

    void def(Object o){
        System.out.println("object");
    }
    void def(String s){
        System.out.println("string");
    }

    void ghj(int a,int b){
        System.out.println("int a,int b");
    }
    void ghj(long a,long b){
        System.out.println("long a,long b");
    }
    void ghj(Integer a,Integer b){
        System.out.println("Integer a,Integer b");
    }
    void ghj(int...a){
        System.out.println("int...a");
    }

    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.abc(5);// int -> long->byte
        t1.def("ok");//string->object
        t1.def(new StringBuilder("hello"));
        System.out.println("-------------------------------");

        t1.ghj(1,2);
        //если закоментим  void ghj(int a,int b) то ->void ghj(long a,long b)->void ghj(Integer a,Integer b)->void ghj(int...a)
    }
}
