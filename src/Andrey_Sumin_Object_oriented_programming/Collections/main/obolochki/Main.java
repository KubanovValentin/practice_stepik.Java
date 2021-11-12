package Andrey_Sumin_Object_oriented_programming.Collections.main.obolochki;

public class Main {
    public static void main(String[] args) {
        // напишем тип и оболочки(аналог)
//        byte b;
//        Byte b1;
//        short s;
//        Short s1;
//        int i;
//        Integer i1;
//        long l;
//        Long l1;
//        char ch;
//        Character ch1;
//        float f;
//        Float f1;
//        double d;
//        Double d1;
//        boolean bool;
//        Boolean bool1;

        String s = "100";
        String test = "500";
        System.out.println(s + test);
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(test);
        System.out.println(a + b);

        String s1 ="false";
        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(b1);


        String str="Это Валентин. Я программист по направлению Java.";

        String name=str.substring(4,12);
        String proffa=str.substring(16,27);
        System.out.println(name);
        System.out.println(proffa);
    }
}
