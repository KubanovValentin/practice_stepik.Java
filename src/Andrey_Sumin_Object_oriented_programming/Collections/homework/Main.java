package Andrey_Sumin_Object_oriented_programming.Collections.homework;


public class Main {
    public static void main(String[] args) {
        String strInfo = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
        String nameStr = strInfo.substring(4, 8);
        String postStr = strInfo.substring(54, 65);
        String ageStr = strInfo.substring(14, 16);
        String s = ageStr;
        int ageInt = Integer.parseInt(s);
        String heightStr = strInfo.substring(32, 37);
        double heightDouble=Double.parseDouble(heightStr);

        Man man=new Man(nameStr,ageInt);
        Man  man1=new Man(postStr);
        Man man2=new Man(nameStr,ageInt,heightDouble);
        System.out.println(man.getName());
        System.out.println(man.getAge());
        System.out.println(man1.getPost());
        System.out.println(man2.getHeight());
    }
}
