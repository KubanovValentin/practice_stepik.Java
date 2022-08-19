package Zaur_OOP.podpaket_lesson30.Test19;

public class Test {
}

class Employee {
    static String name = "Ivan";
    static int id = 5;

    static void printInfo() {
        System.out.println("student: " + name + " id:" + id);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.printInfo();
    }
}