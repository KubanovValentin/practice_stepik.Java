package homework4.Employee;


//пересоздайте класс Employee таким образом, чтобы, переменная salary была не доступна вне класса,
// переменная surname была доступна отовсюду, а переменная id только внутри пакета.
// Также создайте 3 public метода, которые будут показывать на дисплее значение этих переменных.
// создайте для данного класса 3 разных конструктора public, default, private access modifier-ами.
// в конструкторах присваивайте переменным класса значения из параметров.
// создайте новые классы в том же и в другом пакете. попытайтесь в них создать объекты класса
// Employee и вывести на экран значения переменных данного объекта с помощью метода println
// и  методов самого класса


public class Employee {
    int id;//только внутри пакета
    public String surname;//доступна отовсюду
    int age;
    private double salary;//не доступна вне класса
    String departament;

    //   3 разных конструктора public, default, private access modifier-ами
    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    private Employee(double salary2) {
        salary = salary2;
    }

    double yvelichenieZP() {
        salary *= 2;
        return salary;
    }

    //методы которые будут показывать на дисплее значение этих переменных
    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("Surname = " + surname);
    }

    public void getSalary() {
        System.out.println("Salary = " + salary);
    }

}
//    создайте новые классы
class EmployeeTest {
    public static void main(String[] args) {
//создать объекты класса Employee и вывести на экран значения переменных данного объекта
       Employee emp1 =new Employee(5);
       Employee emp2=new Employee("Petrov");
//     Employee emp3=new Employee(4324.454);  // это  private Employee(double salary2)


        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);


        System.out.println(emp2.id);
        System.out.println(emp2.surname);
//        System.out.println(emp2.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        emp2.getId();
        emp2.getSalary();
        emp2.getSurname();

    }
}