package Zaur_OOP.podpaket_lesson24.Interface;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.extinguish_the_fire("воды");

        Driver dr=new Driver();
        dr.swim();
        dr.help();
        dr.extinguish_the_fire("огнетушителя");

        Employee e=new Driver();
        Help_able h=new Driver();
        Swim_able sw=new Driver();
        e.eat();
        h.extinguish_the_fire("Help_able");
        System.out.println(h.a+1000);
    }
}
class Employee {
    double salary = 100;
    String name="Валентин";
    int age;
    int experience;
    void eat() {
        System.out.println("кушать");
    }
    void sleep() {
        System.out.println("спать");
    }
}
class Teacher extends Employee implements Help_able{
    //количество учеников
    int numberOfStudents;
    //учит
    void studies() {
        System.out.println("учить");
    }

    @Override
    public void help() {
        System.out.println("учитель оказывает помощь");
    }

    @Override
    public void extinguish_the_fire(String predmet) {

        System.out.println("учитель может тушить пожар с помощью - "+predmet);
    }
}

class Driver extends Employee implements Help_able,Swim_able{
    //название машины
    String nameOfTheMachine;
    //водить
    void drives() {
        System.out.println("водить");
    }

    @Override
    public void help() {
        System.out.println(a);
        System.out.println("водитель оказывает помощь");
    }

    @Override
    public void extinguish_the_fire(String predmet) {
        System.out.println("водитель может тушить с помощью - "+predmet);
    }

    @Override
    public void swim() {
        System.out.println("водитель может плыть и спасти");
    }
}
interface Help_able{
    public final static int a=10;
    //помощь
    void help();
    //тушить пожар
    void extinguish_the_fire(String predmet);
}
interface Swim_able{
    //плавать спасать
    void swim();
}

abstract class Y implements Swim_able{}
abstract class X extends Y{}
class Z extends Y{
    @Override
    public void swim() {

    }
}