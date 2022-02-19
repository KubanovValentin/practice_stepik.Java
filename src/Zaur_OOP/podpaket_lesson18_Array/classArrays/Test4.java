package Zaur_OOP.podpaket_lesson18_Array.classArrays;

public class Test4 {
    public static void main(String[] args) {
        char[]array={'p','r','i','v','e','t'};
        String s=new String(array);
        System.out.println(s);
        //метод append
        StringBuilder sb=new StringBuilder("Hello World");
        sb.append(array,2,3);
        System.out.println(sb);
        //метод insert
        sb.insert(2,array,1,3);
        System.out.println(sb);
    }

}
