package Zaur_OOP.podpaket_lesson26.wrapper_classes;

import Zaur_OOP.podpaket.A;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//autoboxing
        list.add(5);
        list.add(7);
        int a = list.get(0);//unboxing

        System.out.println(a);
        {
            Long l = 60l;
            Number b = new Integer(10);
            int c = (Integer) b;//unboxing
            switch (c) {

            }
        }
        //метод parse
        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";

        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        double d1 = Double.parseDouble(s3);

        System.out.println(i1);
        System.out.println(b1);
        System.out.println(d1);

        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);
        Byte b10=new Byte((byte) 4);
        System.out.println(i3);

        System.out.println(i3.equals(d1));//неодинаковые типы и классы false всегда

    }
}
