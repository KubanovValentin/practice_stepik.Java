package Zaur_OOP;

public class Car2 {
    String color;
    String engine;
    int speed;

    //создаем шаблоны методов
    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println(" cvet: " + color + "\n motor: " + engine + "\n skorost: " + speed);
    }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 c1=new Car2();
        c1.color="red";
        c1.engine="v6";
        c1.speed=60;

        //теперь если мы хотим узнать инфу о нашем с1 то выводим метод showInfo
        c1.showInfo();
        //теперь прибавляем скорость
        c1.gaz(20);
        c1.showInfo();
        //если мы тормозим
        c1.tormoz(80);
        c1.showInfo();
    }
}