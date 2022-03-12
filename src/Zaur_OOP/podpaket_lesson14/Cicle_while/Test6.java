package Zaur_OOP.podpaket_lesson14.Cicle_while;

public class Test6 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("stavka");
            System.out.println(money);
            money -= 10;
        } while (money > 50);
    }
}
