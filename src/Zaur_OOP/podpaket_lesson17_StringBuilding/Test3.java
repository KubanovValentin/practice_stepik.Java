package Zaur_OOP.podpaket_lesson17_StringBuilding;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Hello, friend!");
        String s=null;
        s=sb1.append("How are you?").substring(sb1.indexOf("f"),sb1.indexOf("!"));
        System.out.println(s);//friend
    }
}
