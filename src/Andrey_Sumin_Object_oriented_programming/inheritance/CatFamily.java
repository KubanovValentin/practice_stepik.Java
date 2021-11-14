package Andrey_Sumin_Object_oriented_programming.inheritance;

public class CatFamily {
    public int ears;
    public int legs;
    public boolean bigClaws;

    //создаем конструктор без параметров
    //после создания конструктора с параметрами ниже убираем этот

//    public CatFamily() {
//        ears = 2;
//        legs = 4;
//        bigClaws = true;
//    }

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    //напишем метод который будет выводит информацию о животном
    public void showInfo() {
        System.out.println("количество ушей:" + ears + " количество лап:" + legs +" наличие больших когтей:"+bigClaws);
    }

    //напишем метод возращает строку- питаюсь едой
//    public String eat(){
//        return "питаюсь едой";
//    }
    //попробуем не возращать строку а просто вывести в терминал
    //для того что бы у животных была разная еда то идем к ним в класс и делаем метод про еду
    //чтоб переопледелить метод для дочернихклассов (детей) ctrl+o
    public void eat(){
        System.out.println("питаюсь");
    }
}
