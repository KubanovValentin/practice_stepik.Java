package Zaur_OOP.podpaket_lesson30.Test17;

public class Test {
    public static void main(String[] args) {
        Integer i=new Integer(5);
        Long l=new Long(10);
        Double d=new Double(5);
//        System.out.println(i==l);//разные типы error
        System.out.println(i.equals(l));//false
//        System.out.println(i==d);//разные типы error
        System.out.println(i.equals(d));//false
    }
}
