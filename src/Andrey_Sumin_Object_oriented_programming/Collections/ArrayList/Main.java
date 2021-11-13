package Andrey_Sumin_Object_oriented_programming.Collections.ArrayList;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

//        --------составим теперь коллекцию с типом инт
//заполним от 1 до 1000
        ArrayList<Integer> numbers =new ArrayList<>();
        for (int i=0;i<1000;i++){
            numbers.add(i);
        }
        int sum=0;
        for (int i: numbers){
            sum+=i;
//            System.out.println(sum);
//            System.out.println(i);
        }
        System.out.println(sum);
    }
}
