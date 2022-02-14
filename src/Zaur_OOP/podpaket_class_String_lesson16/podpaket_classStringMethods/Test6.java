package Zaur_OOP.podpaket_class_String_lesson16.podpaket_classStringMethods;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s="PriveT=yEs!!!";
        System.out.println(s);
        String s1=s.toLowerCase();
        System.out.println(s1);
        String s2=s.toUpperCase();
        System.out.println(s2);

        boolean b=s.contains("Pre");
        System.out.println(b);
    }
}
