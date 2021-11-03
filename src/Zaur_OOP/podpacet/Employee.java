package Zaur_OOP.podpacet;

public class Employee {
     protected double salary;
     protected void dvoinajZP(){
        System.out.println("novaya z/p= " +salary*2);
    }
     protected Employee(double salary2){
        salary=salary2;
    }

     public static void main(String[] args) {
        Employee emp=new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinajZP();
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinajZP();
    }
}