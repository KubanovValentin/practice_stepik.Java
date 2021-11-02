package Zaur_OOP;
//более корректное написание конструктора в конструкторе


public class EmployeeConstrVnConstr {
    EmployeeConstrVnConstr(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    EmployeeConstrVnConstr(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    EmployeeConstrVnConstr(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeConstrVnConstrTest {
    public static void main(String[] args) {
        EmployeeConstrVnConstr emp1 = new EmployeeConstrVnConstr(1, "Пупкин", 26);
        System.out.println(emp1.surname);

        EmployeeConstrVnConstr emp3 = new EmployeeConstrVnConstr("Белый", 56);
        System.out.println(emp3.age);

        EmployeeConstrVnConstr emp4 = new EmployeeConstrVnConstr(23, "Петухов", 34, 56.678, "IT");
        System.out.println(emp4.surname);
    }


}
