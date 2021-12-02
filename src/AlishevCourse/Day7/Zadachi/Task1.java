package AlishevCourse.Day7.Zadachi;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2010, 50, 40000);
        Airplane airplane2 = new Airplane("Boing", 2010, 30, 40000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    //  “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
    public void info() {
        System.out.println("Изготовитель: " + producer + "," +
                " год выпуска: " + year + "," +
                " длина: " + length + "," +
                " вес: " + weight + "," +
                " количество топлива в баке: " + fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    //static метод принадлежит классу и вызывать будем не на объектах а самимс классом
// метод сравнить самолеты
// и для того чтоб сравнить нужно в аргумент()добавить объеты для сравнения
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("первый самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("второй самолет длиннее");
        } else {
            System.out.println("длинны самолетов равны");
        }

    }
}