package homework3;
//Создать класс работник, в котором будет три поля-имя, должность, зарплата.
// Добавить метод с параметрами int , тип возращаемого значения String,
// который возращает информацию о сотруднике,а также о сумме зарплаты, коротую он получил за i месяцев
// (значение  i передаеться в качестве параметра)
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Валентин Кубанов","программист-Java", 200000);
        System.out.println(worker.getInfo(12));
    }
}