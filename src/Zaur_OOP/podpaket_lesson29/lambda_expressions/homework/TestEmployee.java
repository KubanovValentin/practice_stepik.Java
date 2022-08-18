package Zaur_OOP.podpaket_lesson29.lambda_expressions.homework;


import java.util.ArrayList;
import java.util.function.*;

public class TestEmployee {
    void printEmployee(Employee emp) {
        System.out.println("Работник - "
                + emp.name
                + ", из отдела: "
                + emp.department
                + ", с заработной платой = "
                + emp.salary + " $.");
    }

    void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> t) {
        for (Employee emp : aL) {
            if (t.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> listEmp = new ArrayList<>();
        Employee emp1 = new Employee("Федина", "IT", 2000);
        Employee emp2 = new Employee("Киреев", "IT", 1000);
        Employee emp3 = new Employee("Драгни", "IT", 1300);
        Employee emp4 = new Employee("Квашнин", "T", 800);
        Employee emp5 = new Employee("Путнин", "T", 600);
        Employee emp6 = new Employee("Марков", "T", 600);
        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(emp3);
        listEmp.add(emp4);
        listEmp.add(emp5);
        listEmp.add(emp6);
        TestEmployee tE = new TestEmployee();

        tE.filtraciyaRabotnikov(listEmp, (Employee emp) -> {
            return emp.department.equals ("IT") && emp.salary > 1200;
        });
        tE.filtraciyaRabotnikov(listEmp, (Employee emp) -> {
            return emp.department != ("IT") && emp.salary < 1000;
        });
        tE.filtraciyaRabotnikov(listEmp, (Employee emp) -> {
            return emp.name.equals("Федина");
        });
        tE.filtraciyaRabotnikov(listEmp,emp -> emp.name.startsWith("К"));
    }
}

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}