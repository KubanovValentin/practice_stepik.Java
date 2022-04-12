package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting;

public class Test3 {
    public static void main(String[] args) {
        Employee1 emp1 = new Doctor1();//upcasting
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
        Help_able1 h1 = new Doctor1();
        Employee1 e=new Employee1();

        Doctor1 d1 = (Doctor1) emp1;//downcasting
        d1.heals();
        System.out.println(d1.specializaciya);

        System.out.println(((Teacher1) emp2).kolichestvoStudent);
        ((Teacher1) emp2).studies();
        h1.help();
        System.out.println(((Doctor1) h1).specializaciya);
        ((Doctor1) h1).heals();
        ((Doctor1) h1).help();

        h1.help();
        System.out.println(e==emp1);
        System.out.println(e.equals(emp1));

    }
}

class Employee1 extends java.lang.Object {
    double salary = 100;
    String name = "Vitek";
    int age;
    int experience;

    void eat() {
        System.out.println("eat");
    }

    void sleep() {
        System.out.println("sleep");
    }
}

class Doctor1 extends Employee1 implements Help_able1 {
    String specializaciya = "hirurg";

    void heals() {
        System.out.println("doctor heals");
    }

    @Override
    public void help() {
        System.out.println("doctor provides assistance//доктор оказывает помощь");
    }
}

class Teacher1 extends Employee1 {
    int kolichestvoStudent = 100;

    void studies() {
        System.out.println("teacher studies");
    }
}

class Driver1 extends Employee1 {
    String nazvanieMachin;

    void drives() {
        System.out.println("driver drives");
    }
}

interface Help_able1 {
    void help();
}