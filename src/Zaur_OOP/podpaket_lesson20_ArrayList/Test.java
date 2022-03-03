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
        ArrayList<String> list5=new ArrayList<String>(list2);
        //добавляем только String-ArrayList<String> list2
        list2.add("poka");
        list2.add("ok");
        System.out.println(list2.toString());
        System.out.println(list2==list5);
        System.out.println(list2.equals(list5));
        //можно увидеть и так
        List<StringBuilder> list3=new ArrayList<StringBuilder>();
        list3.add(new StringBuilder("ok"));
        list3.add(new StringBuilder("privet"));
        System.out.println(list3.toString());
        for (StringBuilder sb:list3){
            System.out.println(sb);
        }
    }

}
class Car{}
class Student{}