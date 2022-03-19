package JavaRushTaskSt.Zadachi_13.LV.Parameterized_types_in_Java_Generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();


        for (int i = 0; i < 10; i++)
            numbers.add(i * 2.5);


        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + (Double) numbers.get(i);
            System.out.println(sum);
        }
    }
}
