package Andrey_Sumin_Object_oriented_programming.inheritance;

public class CatFamily {
    public int ears;
    public int legs;
    public boolean bigClaws;

    //создаем конструктор без параметров
    public CatFamily() {
        ears = 2;
        legs = 4;
        bigClaws = true;
    }

    //напишем метод который будет выводит информацию о животном
    public void showInfo() {
        System.out.println("количество ушей:" + ears + " количество лап:" + legs +" наличие больших когтей:"+bigClaws);
    }
}
