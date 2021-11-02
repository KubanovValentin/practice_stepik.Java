package Zaur_OOP;

public class Employee {
//это не корректный способ вызывать конструктор в конструкторе,в классе EmployeeConstrVnConstr будет правильный код

    //ниже мы вызываем конструктор а в нутри его тоже конструктор
    // с помощью this мы можем это сделать
    // и выражение this должно быть первым как ниже
    Employee(int id2, String surname2, int age2) {
        this(surname2, age2);

        id = id2;
//      surname = surname2;
//      age = age2;
    }

    Employee(String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        this(id4, surname4, age4);
//        id = id4;
//        surname = surname4;
//        age = age4;
        salary = salary4;
        department = department4;
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
