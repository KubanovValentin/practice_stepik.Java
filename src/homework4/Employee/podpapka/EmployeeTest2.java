package homework4.Employee.podpapka;

//создайте новые классы  в другов пакете


public class EmployeeTest2 {
    public static void main(String[] args) {
        homework4.Employee.Employee emp1 = new homework4.Employee.Employee(5);
//        homework4.Employee.Employee emp2 =new homework4.Employee.Employee("Petrov");       //       default
//        homework4.Employee.Employee emp3 =new homework4.Employee.Employee(4324.454);      //        private

//        System.out.println(emp1.id);                             //                  default
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);                         //                   private

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();
    }


}
