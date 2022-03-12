package Zaur_OOP.podpaket_lesson22_Inheritance;

public class Test {
    void uvelichenieZP(Employee e){
        e.salary=e.salary+100;
    }
    public static void main(String[] args) {
        Doctor doc=new Doctor();
        doc.name="Ivan";
        doc.age=50;
        doc.experience=25;
        System.out.println(doc.name);
//        doc.specializaciya="хирург";
        doc.lechit();
        doc.eat();
        doc.sleep();
        System.out.println(doc.salary);
        Test t=new Test();
        t.uvelichenieZP(doc);
        System.out.println(doc.salary);

    }
}
class Employee extends java.lang.Object{
    double salary=100;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("кушать");
    }
    void sleep(){
        System.out.println("спать");
    }
}
class Doctor extends Employee{
//    String specializaciya;

    void lechit(){
        System.out.println("лечить");
    }
}
class Teacher extends Employee{
    int kolichestvoUchenikov;

    void uchit(){
        System.out.println("учить");
    }
}

class Hirurg extends Doctor{
    String scalpel;
    void operaciya(){
        System.out.println("проводит операции");
    }
}
class Dantist extends Doctor{
    String zubnoi;
    void lechitZub(){
        System.out.println("лечит зубы");
    }
}
class Driver extends Employee{
    String nazvanieMachini;

    void vodit(){
        System.out.println("водить");
    }
}