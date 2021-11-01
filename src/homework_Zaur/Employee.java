package homework_Zaur;

//создайте класс Employee с атрибутами id, surname, age, salary, department, которые должны задаваться в конструкторе.
// в данном классе также создайте метод увеличения зарплаты вдвое.
// создайте второй класс EmployeeTest в котором создайте 2 объекта класса Employee.
//увеличить зараплату каждому работнику вдвое с помощью метода
// и выведите на экран значение новой зарплаты
public class Employee {
    //переменные класса
    int id;
    String surname;
    int age;
    double salary;
    String department;
    //конструктор,при создании объекта надо вводить все параметры
    Employee(int id2, String surname2, int age2, double salary2, String department2){
        id=id2;
        surname=surname2;
        age=age2;
        salary=salary2;
        department=department2;
    }
    //метод(не принимает ни каких параметров)
    double uvelichZarplat(){
        salary*=2;
        return salary;
    }

}
//создаем класс
class EmployeeTest {
    //метод майн
    public static void main(String[] args) {
        //два объекта класса Employee
        Employee emp1=new Employee(1,"Вася",25,234_987.45,"IT");
        Employee emp2=new Employee(13,"Петя",43,432_987.05,"IT");

        //с помощью переменной вызываем метод
        emp1.uvelichZarplat();
        System.out.println("Новая зарплата работника: "+ emp1.surname+" : "+ emp1.salary);

        double newSalary = emp2.uvelichZarplat();
        System.out.println("Новая зарплата работника: "+ emp2.surname+" : "+ newSalary);
    }
}

