package Zaur_OOP.podpaket_class_String;

public class Test2 {
    public static void main(String[] args) {
        String s1=new String("Privet");//создан новый об-1
        String s2="Privet";//если pool пуст создан новый об-1,
        System.out.println("Privet");//Java проверяет pool (он создан на 2 строчке) и будем использовать этот об-0
        System.out.println("poka");//Java проверяет pool (нет)-тогда создает новый об-1
        System.out.println("poka"=="privet");//Java проверяет pool("poka" есть и он не об-0),("privet" нет такого и он создает нов об-1)
        String autumn=new String("Privet");//создан новый об-1

        //в данном коде созданно 5 объектов
    }
}
