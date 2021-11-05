package homework5;

public class Zadacha1 {

    //1ый пусть  умножает 3 числа из параметра метода и возвращает их
    //произведение
    static double umnojenie(double a, double b, double c) {
        return a * b * c;
    }

    //2ой - делит первое число из параметра на второе и ничего не возвращает,
    //лишь выводит на дисплей в читабельном виде целое частное и остаток
    static void delenie(int a, int b) {
        System.out.println("целое частное = " + a / b + "; остаток = " + a % b);
    }
}
class Zadacha1Test {
    public static void main(String[] args) {
        //Во втором классе по два раза используйте данные методы
        System.out.println(Zadacha1.umnojenie(2,3,4));
        Zadacha1.delenie(9,2);
        System.out.println(Zadacha1.umnojenie(2.5,3.5,4));
        Zadacha1.delenie(15, 4);
    }
}