package Zaur_OOP.podpaket_lesson17_StringBuilding;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.insert(4,"-hi...."));//Good-hi.... Day!!!
        System.out.println(sb2.insert(sb2.length(),"hello"));//Good-hi.... Day!!!hello

        StringBuilder sb10=new StringBuilder("Hello World");
        sb10.delete(3,6);
        System.out.println(sb10);//HelWorld

        StringBuilder sb11=new StringBuilder("3. Hello World");
        sb11.deleteCharAt(0);
        System.out.println(sb11);//. Hello World

        StringBuilder sb12=new StringBuilder("Hello Valentin");
        sb12.reverse();
        System.out.println(sb12);//nitnelaV olleH

        StringBuilder sb13=new StringBuilder("Vsem privet");
        sb13.replace(0,4,"Petr");
        System.out.println(sb13);//Petr privet

        System.out.println(sb13.capacity());//27
        System.out.println(sb1.capacity());//16
    }
}
