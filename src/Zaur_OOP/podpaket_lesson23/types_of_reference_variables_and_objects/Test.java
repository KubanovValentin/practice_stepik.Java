package Zaur_OOP.podpaket_lesson23.types_of_reference_variables_and_objects;

public class Test {
    public Object abc() {
        return new String("любой тип");//ретерн может быть любой тип (String, int и т д)потому что тип метода Object
//        return new int[]{1,2,3,4,5,6};
//        return new Doctor();
    }
    public Doctor abcd(){
//        return new Doctor();
        return new Hirurg();
    }

    public static void main(String[] args) {
        Doctor d = new Doctor();//объект Doctor
        Teacher е = new Teacher();//объект Teacher
        Driver dr = new Driver();//объект Driver
        Employee e = new Employee();//объект Employee
        // Doctor это Employee(работник) и все остальные

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();

//        emp1.lechit(); сдесь тип референс переменной
//        Employee хоть и ссылается она на объект Doctor но class Employee нет методов class Doctor

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
//        Driver dr2=new Employee(); нельзя будет ошибка

        Hirurg h = new Hirurg();
        Doctor d2 = new Hirurg();//хирург это доктор
        System.out.println(d2.age);
        d2.lechit();
        Employee emp4 = new Hirurg();//хирург это сотрудник
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("кушать");
    }

    void sleep() {
        System.out.println("спать");
    }
}

class Doctor extends Employee {

    void lechit() {
        System.out.println("лечить");
    }
}

class Hirurg extends Doctor {
    String scalpel;

    void operaciya() {
        System.out.println("проводит операции");
    }
}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("учить");
    }
}

class Driver extends Employee {
    String nazvanieMachini;

    void vodit() {
        System.out.println("водить");
    }
}