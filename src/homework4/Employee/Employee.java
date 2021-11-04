package homework4.Employee;

public class Employee {
     public double salary;
     public String surname="Пупкин";
     public int id;
     void dvoinajZP(){
        double result=salary*2;
        System.out.println("novaya z/p= " +result);
    }
     public Employee(double salary2){
        salary=salary2;
    }
    public Employee(int id2){
         id=id2;
    }

    public static void main(String[] args) {
        Zaur_OOP.podpacet.Employee emp=new Zaur_OOP.podpacet.Employee(500);
        System.out.println(emp.salary);
        emp.dvoinajZP();
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Zaur_OOP.podpacet.Employee emp = new Zaur_OOP.podpacet.Employee(500);
        System.out.println(emp.salary);
        emp.dvoinajZP();
    }
}