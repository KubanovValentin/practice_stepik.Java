package Zaur_OOP.podpaket_class_String_lesson16.podpaket_classStringMethods;

public class Test8 {
    public static void main(String[] args) {
        String s1=new String("ok");
        String s2=new String("ok");
        System.out.println(s1==s2);//false сравнение ссылок на разные объекты
        System.out.println(s1.equals(s2));//true сравнение 2 одинаковых объектов

        String s3="privet";
        String s4="privet";
        System.out.println(s3==s4);//true ссылки на один и тот же объект(в pool был создан, а потом ссылается)
        System.out.println(s3.equals(s4));//true потому что объекты одинаковые(и ссылки тоже)
        System.out.println(s1!=s4);//true потому что это разные ссылки и объекты разные(!= это не равно)

        String s5="kak dela?";
        String s6="Kak Dela?";
        System.out.println(s5.equals(s6));//false объекты отличаются буквами(капсом)
        System.out.println(s5.equalsIgnoreCase(s6));//true игнорирует капс буквы
    }
}
