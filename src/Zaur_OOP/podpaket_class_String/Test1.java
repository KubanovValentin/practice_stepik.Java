package Zaur_OOP.podpaket_class_String;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("Hello");//новый объект
        System.out.println("1." + s1);
        String s2 = new String("By");//новый объект
        System.out.println("2." + s2);
        s2 = s1;
        System.out.println("3." + s2);
        boolean b = s2 == s1;
        System.out.println("4." + b);
        String s4 = "hi";//поиск объекта в String pool если его нет то создает объект
        String s5 = new String("Hello");//новый объект
        boolean b2 = s1 == s5;
        System.out.println("5." + b2);
        String s6 = "Hello";
        String s7 = "Hello";
        boolean b3 = s7 == s6;
        System.out.println("6." + b3);
    }
}
