package Zaur_OOP.podpaket_class_String_lesson16.podpaket_classStringMethods;

public class Test2 {
    public static void main(String[] args) {
        String s1=new String("privet");
        String s2=new String("abcdefabcd");
        String s3=new String("  by by  ");
        String s4=new String(" and");

        String s10=s1.substring(3);
        System.out.println(s10);
        String s11=s1.substring(3,5);
        System.out.println(s11);

        String s12=s3.trim();
        System.out.println(s12);
        System.out.println(s3);

        String s13=s1.replace('t','D');
        System.out.println(s13);
        String s14=s1.replace("pri","Priii");
        System.out.println(s14);

        String s15=s1.concat(s4);
        System.out.println(s1+s4+s3);
        System.out.println(s15.concat(s3));
    }
}
