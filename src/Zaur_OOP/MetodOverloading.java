package Zaur_OOP;

public class MetodOverloading {
    //написать метод выводящий на экран переменную типа данных инт
    //пишем метод которорый ничего не возращает
    void show(int i1){
        System.out.println(i1);
    }

    //напишем метод возращающий boolean
    void show(boolean b1){
        System.out.println(b1);
    }

    //переменную типа стринг
    void show(String s1){
        System.out.println(s1);
    }

    void show(String s, int a){
        System.out.println("string: "+s+" "+" int: "+ a);
    }
    void show( int a, String s){
        System.out.println("hello !!!!");
    }
}
//проверим работу метода
class MetodOverloadingTest{
    public static void main(String[] args) {
        MetodOverloading mO=new MetodOverloading();//тюк конструктор дефолд -мы не пишем значения
        //вызываем метод showInt
//        mO.showInt(100);

        //но будем работать так(ниже)
        int a=500;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s= "Привет";
        mO.show(s);
        mO.show(123,"vau");
        mO.show("raz dva tri",3412);
        mO.show(a,s);
        mO.show(s,a);
    }
}