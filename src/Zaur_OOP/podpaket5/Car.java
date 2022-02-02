package Zaur_OOP.podpaket5;

public class Car {
    String color;
    String engine;
    //будем считывать количество машин которые создали count
    static int count;
    //   создаем конструктор
    public Car(String color2, String engine2){
        count++;
        color=color2;
        engine=engine2;
    }
    //создаем 2 метода в данном классе
    //метод показывающий цвет
    public void showColor(){
        System.out.println("цвет машины : "+ color);
        this.changeColor("red");
    }
    //принимает значение
    public void changeColor(String color3){
        System.out.println("цвет машины изменился");
        int cena=5000;
        color=color3;
        cena+=1000;
    }



}
