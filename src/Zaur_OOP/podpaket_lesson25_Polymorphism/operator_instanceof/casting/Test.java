package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee [] array={emp1,emp2,emp3};
        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Teacher);
        System.out.println(emp1 instanceof Help_able);
        System.out.println(emp1 instanceof Driver);
    }
}
abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}
class Teacher extends Employee implements Help_able {
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements Help_able {
    @Override
    void work() {
        System.out.println("Driver works");
    }

    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Help_able {
    @Override
    void work() {
        System.out.println("Doctor works");
    }

    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Help_able {
    void help();
}