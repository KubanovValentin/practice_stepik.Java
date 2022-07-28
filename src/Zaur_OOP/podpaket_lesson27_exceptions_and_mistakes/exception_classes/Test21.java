package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

public class Test21 {
}
class Samolet{
    String sostoyanie="v ojidanii";//v ojidanii,v vozdyxe,polet otmenen
    public void letet(){
        sostoyanie="v vozdyxe";
        System.out.println("samolet letit");
    }
    public void ojidat(){
        if (sostoyanie.equals("v vozdyxe")){
            throw new IllegalArgumentException("samolet uze v vozduxe");
        }
        sostoyanie="v ojidanii";
        System.out.println("samolet v ojidanii poleta");
    }
    public void otmenenPolet(){
        if (sostoyanie.equals("v vozdyxe")){
            throw new IllegalArgumentException("samolet uze v vozduxe");
        }
        sostoyanie="polet otmenen";
        System.out.println("polet samoleta otmenen");
    }

    public static void main(String[] args) {
        Samolet s=new Samolet();
        s.letet();
        s.ojidat();
    }
}