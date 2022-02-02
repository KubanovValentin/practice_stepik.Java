package Zaur_OOP.podpaket_lesson10;

public class Employee {
    public String name;
    public double salary;
    public double premia;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a){
        a=a*2;
        return a;
    }
    public double premia(){
        premia=salary*1.4-salary;
       return premia;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp=new Employee("Valentin",600.0);
        double dvz=emp.uvelichitel(emp.salary);

        System.out.println("з/п сотрудника на пол-ставки: "+emp.name+" равна = "+emp.salary+" рублей");

        System.out.println("на полную ставку = "+dvz+" рублей");

        emp.premia();
        System.out.println("премия сотрудника: "+ emp.name+" составляет = "+emp.premia+" рублей");

    }
}