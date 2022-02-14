package Zaur_OOP.podpaket_class_String_lesson16.podpaket_classStringMethods;

public class Test1 {

    public static void main(String[] args) {
        String s1=new String("privet");
        String s2=new String("abcdefabcd");
        int x=s1.length();
        System.out.println(x);
//        System.out.println(s1.length());

        char c1=s1.charAt(3);
        System.out.println(c1);

        int i1=s1.indexOf('t');
        System.out.println(i1);

        int i2=s1.indexOf("vet");
        System.out.println(i2);

        int i3=s2.indexOf('e',2);
        System.out.println(i3);

        boolean b1=s1.startsWith("pr");
        boolean b11=s1.startsWith("vet",2);
        System.out.println(b1);
        System.out.println(b11);
        boolean b2=s2.startsWith("abd");
        boolean b22=s2.startsWith("abcd",0);
        System.out.println(b2);
        System.out.println(b22);

        boolean b3=s1.endsWith("et");
        System.out.println(b3);
    }

}
