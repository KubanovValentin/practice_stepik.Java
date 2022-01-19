package JavaRushTaskSt.Zadachi_11LV.Features_getter_and_setter;

public class Test {
    private String name;//private-поле name

    public Test(String name) {//Инициализация поля через конструктор
        this.name = name;
    }

    public String getName() {//getName()— метод возвращает значение поля name
        return name;
    }

    public void setName(String name) {//setName()— метод изменяет значение поля name
        this.name = "name";
    }

    public static void main(String[] args) {
        System.out.println();
    }



}
