package AlishevCourse.Day6.Zadachi;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane=new Airplane("Boing",2010,30,40000);

    airplane.setYear(2011);
    airplane.setLength(35);

    airplane.fillUp(5000);
    airplane.fillUp(10000);

    airplane.info();
    }
}
class Airplane{
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
        this.fuel=0;
    }
  //  “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
    public void info(){
        System.out.println("Изготовитель: "+producer+","+
                " год выпуска: "+year+","+
                " длина: "+length+","+
                " вес: "+weight+","+
                " количество топлива в баке: "+fuel);
    }
    public void fillUp(int inputFuel){
        fuel+=inputFuel;
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
}