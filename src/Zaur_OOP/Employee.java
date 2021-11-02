package Zaur_OOP;

public class Employee {

    Employee(int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }

    Employee(String surname2, int age2) {
        surname = surname2;
        age = age2;
    }

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Пупкин", 26);
        System.out.println(emp1.surname);

        Employee emp3 = new Employee("Белый", 56);
        System.out.println(emp3.age);

        Employee emp4 = new Employee(23, "Петухов", 34, 56.678, "IT");
        System.out.println(emp4.surname);
    }


}
