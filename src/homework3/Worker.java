package homework3;

public class Worker {
    String name;
    String profession;
    int salary;
    int month;

    public Worker(String name, String profession, int salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    public Worker (int month) {
        this.month = month;
    }

    int monthSolary() {
        return month * salary;
    }

}
