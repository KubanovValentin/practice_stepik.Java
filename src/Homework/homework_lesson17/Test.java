package Homework.homework_lesson17;

public class Test {
    public static void ravenstvo(StringBuilder sb1,StringBuilder sb2) {
        boolean result=sb1.equals(sb2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("hello");
        StringBuilder sb2=new StringBuilder("by");

        ravenstvo(sb1,sb2);
    }
}
