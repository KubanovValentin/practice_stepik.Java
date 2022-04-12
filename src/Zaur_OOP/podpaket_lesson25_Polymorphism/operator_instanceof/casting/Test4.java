package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting;

import Homework.homework.lesson10.p4.D;

public class Test4 {
    public static void main(String[] args) {
        Employee2 empl = new Employee2();
        Employee2 empl1 = new Doctor2();//upcasting
        Employee2 empl2 = new Teacher2();
        Employee2 empl3 = new Driver2();

        Employee2[] array = {empl, empl1, empl2, empl3};
        for (Employee2 em : array) {
            if (em instanceof Driver2) {
                System.out.println(((Driver2) em).nazvanieMachin);
                ((Driver2) em).drives();
            }
        }
    }
}

class Employee2 extends java.lang.Object {
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

class Doctor2 extends Employee2 implements Help_able2 {
    String specializaciya = "hirurg";

    void heals() {
        System.out.println("doctor heals");
    }

    @Override
    public void help() {
        System.out.println("doctor provides assistance//доктор оказывает помощь");
    }
}

class Teacher2 extends Employee2 {
    int kolichestvoStudent = 100;

    void studies() {
        System.out.println("teacher studies");
    }
}

class Driver2 extends Employee2 {
    String nazvanieMachin = "Mercedes";

    void drives() {
        System.out.println("driver drives");
    }
}

interface Help_able2 {
    void help();
}