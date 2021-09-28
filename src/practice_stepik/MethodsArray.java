package practice_stepik;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class MethodsArray {
    public static void main(String[] args){
        //-------------------------------------------------------------------------
// На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом,
// а на следующей строке - натуральное число k.
//Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
//      Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int array[] = new int[n];
//       int i;
//       for ( i = 0; i < n; i++){
//            array[i] = sc.nextInt();
//      }
//       Arrays.sort(array);
//       int z = sc.nextInt();
//        if(z > n || z < 0) {
//            System.out.println("Ошибка ввода");
//        }
//        else {
//            System.out.println(array[z-1]);
//        }
//----------------------------------------------------------------------------не решеная
// На вход подаётся последовательность целых чисел.
// Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.

//        Scanner scanner = new Scanner(System.in);
//        ArrayList < Integer > array = new ArrayList < Integer > ();
//        while (scanner.hasNextInt()) {
//            int i = scanner.nextInt();
//            array.add(i);
//        }
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }


//        for(i = 0; i < count; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        for(i = 0; i < count; i++) {
//            System.out.print(arr[i] + " ");
//        }

//================================================================================
//---------------------------------Задачи на массивы
//==================================================================================
//пусть задан массив строк, и давайте напечатаем все, которые начинаются на букву f:

//        String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
//        for (int i=0; i < numbers.length; i++) {
//            if (numbers[i].charAt(0) == 'f') {
//                System.out.println(numbers[i]);
//            }
//        }
//-------------------------------------
//        String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
//        for (String s: numbers) {
//            if (s.charAt(0) == 'f') {
//                System.out.println(s);
//            }
//        }
//--------------------------------------
//        String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
//        for (int i=0; i < numbers.length; i++) {
//            if (numbers[i].charAt(0) == 'f') {
//                numbers[i] = "deleted";
//            }
//        }
//        System.out.println(numbers[3]);    // deleted
//        String[] numbers1 = {"one", "two", "three", "four", "five", "forty two"};
//        for (String s: numbers1) {
//            if (s.charAt(0) == 'f') {
//                s = "deleted";
//            }
//        }
//        System.out.println(numbers1[3]);    // four
//        ----------------------------------------------------

    }
}
