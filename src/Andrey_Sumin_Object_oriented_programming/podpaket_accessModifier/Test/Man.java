package Andrey_Sumin_Object_oriented_programming.podpaket_accessModifier.Test;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //создадим метод который выводит информацию о человеке на экран
    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
    //сетер(set)
    public void setAge(int age){
        if ((age>0)){
            this.age=age;
        }else {
            System.out.println("возраст должен быть больше 0");
        }

    }
    //гетер(getter)
//    public int getAge(){
//        return age;
//    }
//    public String getName(){
//        return name;
//    }
    //чтоб создать гетеры и сетеры нужно alt+inset

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
