package homework_Zaur;

//создайте класс Employee с атрибутами id, surname, age, salary, department, которые должны задаваться в конструкторе.
// в данном классе также создайте метод увеличения зарплаты вдвое.
// создайте второй класс EmployeeTest в котором создайте 2 объекта класса Employee.
//увеличить зараплату каждому работнику вдвое с помощью метода
// и выведите на экран значение новой зарплаты
public class Employee {
    Employee() {

    }

    int id;
    String surname;
    int age;
    double salary;
    int department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee h1 = new Employee();
        h1.id = 214;
        h1.surname = "Пупкин";
        h1.age = 35;
        h1.salary = 768.567;
        h1.department = 13;


        Employee h2 = new Employee();
        h2.id = 359;
        h2.surname = "Папкин";
        h2.age = 21;
        h2.salary = 374.128;
        h2.department = 13;


    }
}