package Zaur_OOP.podpaket_lesson30.Test32;

public class Test {
    static int x=abc(1);{//1
        x=abc(2);//3
    }
    static {
        x=abc(3);//2
    }

    public static void main(String[] args) {
        Test t=new Test();//ничего
    }
    static int abc(int i){
        System.out.println(i);
        return i;
    }
}
