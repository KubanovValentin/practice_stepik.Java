package Zaur_OOP.podpaket_lesson25_Polymorphism.arrayList;

public class Test1 {
    public static void main(String[] args) {
        //Driver [] array1={new Driver(),new Driver()};
        //Employee [] array2={new Teacher(),new Driver(),new Doctor()};
        //Help_able [] array3={new Teacher(),new Driver(),new Doctor()};

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee [] array={emp1,emp2,emp3};
        //теперь с помощью for each loop вызоваем для всех объектов метод work
        for (Employee emp:array){
            emp.work();
        }

        //Help_able h1 = new Teacher();

        //emp1.work();
        //System.out.println(array1.length);
        //h1.help();
        //emp2.work();
        //emp3.work();
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