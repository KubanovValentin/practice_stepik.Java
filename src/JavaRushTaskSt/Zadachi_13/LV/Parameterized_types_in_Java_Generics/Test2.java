package JavaRushTaskSt.Zadachi_13.LV.Parameterized_types_in_Java_Generics;
import java.util.ArrayList;
//Допустим, у нас был код метода, который суммирует числа в коллекции целых чисел:
public class Test2 {

    public int sum(ArrayList<Integer> numbers) {
        int result = 0;
        for (int i = 0; i < numbers.size(); i++)
            result = result + numbers.get(i);
        return result;
    }
    public static void main(String[] args) {
        ArrayList <Integer>numbers = new ArrayList<Integer>();
        numbers.add(0,12);
        numbers.add(1,1);
        numbers.add(2,122);
        numbers.add(3,55);
        for (Integer n:numbers){
            System.out.println(n);
        }

    }
}
