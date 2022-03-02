package Zaur_OOP.podpaket_lesson20_ArrayList;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        //в основе лежит ArrayList(массив c типом объект)
        //добавим с разными типами данныч в ArrayList list
        ArrayList list=new ArrayList();
        list.add("privet");

        Car c=new Car();
        list.add(c);

        Student student=new Student();
        list.add(student);

        list.add(new StringBuilder("ok"));

        //но так не делают.нужно работать с определенным типом данных

        ArrayList<String> list2=new ArrayList<String>();
        //добавляем только String-ArrayList<String> list2
        list2.add("poka");
        list2.add("ok");
        System.out.println(list2.toString());
        //можно увидеть и так
        List<StringBuilder> list3=new ArrayList<StringBuilder>();
    }

}
class Car{}
class Student{}