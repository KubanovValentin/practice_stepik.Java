package Zaur_OOP.podpaket_lesson17_StringBuilding;
class Car{

}
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());//11
        System.out.println(sb2.charAt(4));//" "
        System.out.println(sb2.indexOf(" "));//4
        System.out.println(sb2.indexOf("z"));//-1
        System.out.println(sb2.indexOf("!!!"));//8
        System.out.println(sb2.indexOf("o"));//1
        System.out.println(sb2.indexOf("o",2));//2

        String s=sb2.substring(5,8);
        System.out.println(s);//Day
        String s1=sb2.substring(5);
        System.out.println(s1);//Day!!!

        System.out.println(sb2.subSequence(5,9));//Day!

        sb2.append(22);
        System.out.println(sb2);//Good Day!!!22
        sb2.append(true);
        System.out.println(sb2);//Good Day!!!22true
        sb2.append(sb2);
        System.out.println(sb2);//Good Day!!!22trueGood Day!!!22true
        sb2.append(new Car());
        System.out.println(sb2);//Good Day!!!22trueGood Day!!!22trueZaur_OOP.podpaket_lesson17_StringBuilding.Car@880ec60
        sb1.append(new Car());
        System.out.println(sb1);//Zaur_OOP.podpaket_lesson17_StringBuilding.Car@3f3afe78
    }
}
