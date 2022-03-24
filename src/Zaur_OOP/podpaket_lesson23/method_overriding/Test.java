package Zaur_OOP.podpaket_lesson23.method_overriding;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
//        e.eat();

        Employee et = new Teacher();
        et.eat();

        Teacher t = new Teacher();
 //       t.eat();
//        t.eatEda();

    }
}

class Eda {

}

class Fructi extends Eda {

}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    Eda eatEda() {
        System.out.println("кушает еду");
        Eda e = new Eda();
        return e;

    }

    void eat() {
        System.out.println("кушает работник");
    }

    void sleep() {
        System.out.println("спать");
    }
}



class Teacher extends Employee {
    int kolichestvoUchenikov;

    //    Eda eatEda(){
//        System.out.println("кушает еду учитель");
//        Eda e=new Eda();
//        return e;
//
//    }
    @Override //ковыриантый
    Fructi eatEda() {
        System.out.println("кушает еду(f) учитель ");
        Fructi f = new Fructi();
        return f;

    }

    @Override
    void eat() {
        System.out.println("кушает учитель");
    }

    void uchit() {
        System.out.println("учить");
    }

}
class A {
    Employee objectCreation(){
       return new Employee();
    }
}

class B extends A {
    @Override
    Teacher objectCreation(){
        System.out.println("ok");
        return new Teacher();
    }
}
