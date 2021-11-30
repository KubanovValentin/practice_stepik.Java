package AlishevCourse.Day5.Zadachi;

public class Task1 {
    public static void main(String[] args) {
       Car car=new Car();
       car.setYear(2020);
       car.setModel("audi");
       car.setColor("black");

        System.out.println("Out car: "+car.getYear()+" year "+car.getModel()+" model "+car.getColor()+" color ");
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
}