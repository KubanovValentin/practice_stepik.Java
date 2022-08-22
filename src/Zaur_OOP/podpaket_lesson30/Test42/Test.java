package Zaur_OOP.podpaket_lesson30.Test42;

public class Test {
}
class Test1{
    int []array1={-3,0,3};
}
class Test2{
    public static void main(String[] args) {
        Test1[] array2=new Test1[5];//
        array2[0]=new Test1();
        Test1 t=new Test1();
        array2[1]=t;
        t=null;
        array2[1]=null;
    }
}
