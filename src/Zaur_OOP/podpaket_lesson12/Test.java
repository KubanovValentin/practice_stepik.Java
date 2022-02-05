package Zaur_OOP.podpaket_lesson12;

public class Test {
    public static void main(String[] args) {
        int salary = 1500;

        if (salary < 200) {
            System.out.println("маленькая з/п");
        } else if (salary < 400) {
            System.out.println("нормальная з/п");
        } else if (salary < 600) {
            System.out.println("высокая з/п");
        } else {
            System.out.println("отличная з/п");
        }
    }

}
