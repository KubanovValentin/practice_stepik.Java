package AlishevCourse.Day6.Zadachi;

public class Task1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.setColor("black");
        car.setModel("audi");
        car.setYear(2015);
        car.info();
        System.out.println(car.yearDifference(2021));



        Motorbike motorbike=new Motorbike(2020,"Rawasaki","red");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2021));

    }
}
class Car{
    private int year;
    private String model;
    private String color;

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
       return inputYear-year;
    }
}
class Motorbike{
    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
//        return inputYear-year;
        return Math.abs(inputYear-year);
        //Math.abs возвращает положительное число
        // Math.abs(10)->10
        // Math.abs(-10)->10

    }
}