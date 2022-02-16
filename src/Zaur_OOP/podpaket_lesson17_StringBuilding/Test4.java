package Zaur_OOP.podpaket_lesson17_StringBuilding;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("123");
        StringBuilder sb2=sb1.append("45");
        sb2=sb2.append("6").append("7");
        System.out.println("sb1 = "+sb1);//sb1= 1234567
        System.out.println("sb2 = "+sb2);//sb2= 1234567
        System.out.println(sb1.equals(sb2));//true

        StringBuilder sb3=new StringBuilder("123");
        StringBuilder sb4=new StringBuilder("123");
        StringBuilder sb5=sb3;
        System.out.println(sb4==sb3);//false
        System.out.println(sb3.equals(sb4));//false
        System.out.println(sb3==sb5);//true
        System.out.println(sb3.equals(sb5));//true

    }
}
