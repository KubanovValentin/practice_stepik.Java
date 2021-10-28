package homework3;

public class Worker {
    String name;
    String profession;
    int salary;

    public Worker(String name, String profession, int salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    String getInfo(int month){
        return "Имя: " + name + ". Должность: " + profession + ". За последние " + month + " месяцев получил " + month * salary + " рублей.";
    }



}
