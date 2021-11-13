package Andrey_Sumin_Object_oriented_programming.Collections.homework2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        ArrayList<String>names=new ArrayList<>();
        ArrayList<String>namesAdNumbers=new ArrayList<>();

        for (int i=1;i<=10;i++){
            numbers.add(i);
//            System.out.println(i);
        }

        names.add("Валера");
        names.add("Николай");
        names.add("Сергей");
        names.add("Геннадий");
        names.add("Александр");
        names.add("Юлия");
        names.add("Георгий");
        names.add("Валентин");
        names.add("Владимир");
        names.add("Андрей");
        names.remove("Валентин");
        names.add("Светлана");

//        for (String name:names) {
//            System.out.println(name);
//        }


        for (int i=0;i< numbers.size();i++){
            String s = numbers.get(i)+" - "+ names.get(i);
            namesAdNumbers.add(s);
        }
        for (String s:namesAdNumbers) {
            System.out.println(s);
        }







    }
}
