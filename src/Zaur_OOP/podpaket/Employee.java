package Zaur_OOP.podpaket;

public class Employee {
     public double salary;
     public void dvoinajZP(){
         double result=salary*2;
        System.out.println("novaya z/p= " +result);
    }
     public Employee(double salary2){
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