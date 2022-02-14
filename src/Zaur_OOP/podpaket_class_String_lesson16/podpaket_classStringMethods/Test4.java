package Zaur_OOP.podpaket_class_String_lesson16.podpaket_classStringMethods;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;
    String s1 = new String("да");
    String s2 = new String("нет");

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, false);

        if (emp.isManager == true) {
            System.out.println("зарплата сотрудника равна: " + emp.salary + " сотрудник является менеджером - " + emp.s1);
        } else {
            System.out.println("зарплата сотрудника равна: " + emp.salary + " сотрудник является менеджером - " + emp.s2);
        }

//        System.out.println(emp.salary);
        System.out.println("зарплата сотрудника равна: " + emp.salary + " сотрудник является менеджером -" + emp.isManager);
    }
}