package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting.Test_proverka;

public class Test1 {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.sleep();
        Employee empd=new Doctor();
        empd.sleep();

    }
}
class Employee{
    void sleep(){
        System.out.println("Employee sleeps");
    }
}
class Doctor extends Employee{
    @Override
    void sleep() {
        super.sleep();
        System.out.println("Doctor sleeps");
    }
}