package Zaur_OOP.podpaket_lesson23.method_overriding.primer;



public class Test2 {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Teacher t=new Teacher();
//        t.sleep();      // не видно потому что private
        t.sleep();       // его будет видно т.к если менее строгий
        Employee e=new Teacher();
        e.hodit();
    }
}
class Eda {

}
class Frukti extends Eda {

}
class Employee {
    double salary = 5000;
    String name="Valentin";


    Eda eatEda() {
        System.out.println("кушает еду");
        Eda e = new Eda();
        return e;

    }

    void eat() {
        System.out.println("кушает работник");
    }

    private void sleep() {
        System.out.println("спит работник");
    }

    static void hodit(){
        System.out.println("ходит работник");
    }
}
class Teacher extends Employee {
    int kolichestvoUchenikov;


    @Override //ковыриантый
    Frukti eatEda() {
        System.out.println("кушает еду(f) учитель ");
        Frukti f = new Frukti();
        return f;

    }

    @Override
    void eat() {
        System.out.println("кушает учитель");
    }

    void uchit() {
        System.out.println("учить");
    }
 //   @Override
 // он не относится к методу в супер классе потому что тот private и его просто не видно
 // это абсолютно новый метод
    public void sleep() {
        System.out.println("спит учитель");
    }

    static void hodit(){
        System.out.println("ходит учитель");
    }
}