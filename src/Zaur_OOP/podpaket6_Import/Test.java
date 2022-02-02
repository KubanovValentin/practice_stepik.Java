package Zaur_OOP.podpaket6_Import;
import Zaur_OOP.podpaket4.*;//звездочка-это все классы импортируються
//import Zaur_OOP.podpaket4.Student;
import Zaur_OOP.podpaket5.Car;
import java.lang.*;
import static  Zaur_OOP.podpaket3.Test1.*;
public class Test {
    public static void main(String[] args) {
        Car car=new Car("black","v12");
        Student student=new Student("Kosoi",5);
        System.out.println(ab);//static сначала проверяется или ищется внутри класса и пакета а потом во внешнем пакете
    }
}
