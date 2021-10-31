package Zaur_OOP;

public class HumanInfo {
    String name;
    Car3 car;
    BankAccount1 bA;

    //теперь надо создать метод который будет выводить информацию
    void info() {
        System.out.println(" имя: " + name + " \n цвет машины: " + car.color + " \n баланс банковского счета: " + bA.balance);
    }

}

class HumanInfoTest {
    public static void main(String[] args) {
        HumanInfo human = new HumanInfo();
        human.name = "Вася";
        human.car = new Car3("черный", "V8");
        human.bA = new BankAccount1(18, 341_267.234);
        human.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount1 {
    BankAccount1(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}