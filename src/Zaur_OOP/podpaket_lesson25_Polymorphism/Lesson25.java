package Zaur_OOP.podpaket_lesson25_Polymorphism;

public class Lesson25 {
    public static void main(String[] args) {
        Employee emp1=new Teacher();
        Employee emp2=new Driver();
        Employee emp3=new Doctor();
        Help_able h1=new Teacher();

        emp1.work();
        h1.help();
        emp2.work();
        emp2.help();
        emp3.work();
        emp3.help();
    }
}
abstract class Employee implements Help_able{
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
class Teacher extends Employee implements Help_able{
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}
class Driver extends Employee{
    @Override
    void work() {
        System.out.println("Driver works");
    }
    public void help() {
        System.out.println("Driver helps");
    }
}
class Doctor extends Employee{
    @Override
    void work() {
        System.out.println("Doctor works");
    }
    public void help() {
        System.out.println("Doctor helps");
    }
}
interface Help_able{
    void help();
}