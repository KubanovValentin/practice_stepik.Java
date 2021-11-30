package AlishevCourse.Day5.Access_modifiers_public_private_protected_and_default.Packet1;

public class Person {
//    public String name;//нельзя открытые поля, инкапсуляция должна быть
    //можно делать ниже
    public final static String CONSTANT="CONSTANT";

    public static void main(String[] args) {
        Test p1=new Test();
        System.out.println(p1.name);
    }


}
