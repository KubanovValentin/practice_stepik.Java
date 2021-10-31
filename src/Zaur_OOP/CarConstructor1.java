package Zaur_OOP;
//создаем конструктор без параметров но с телом
public class CarConstructor1 {
    CarConstructor1(){
        System.out.println("Object is created!!!");
    }
    String color;
    String engine;
}
class CarConstructor1Test{
    public static void main(String[] args) {
        CarConstructor1 carTest = new CarConstructor1();
        // как только создаеться конструктор компилятор проверяет выше тело и выводит Object is created!!!
    }
}