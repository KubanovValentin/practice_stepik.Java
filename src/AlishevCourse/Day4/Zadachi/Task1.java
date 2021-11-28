package AlishevCourse.Day4.Zadachi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        Random random = new Random();
//        random.nextInt(10);
        int[] array = new int[arrayLength];//создали массив с длинной arrayLength
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);//заполняем рандомными числами от1 до 10 наш массив
        }

        System.out.println(Arrays.toString(array));//вывод массив в консоль с помощью метода Arrays.toString
//-------------------------------------------------------


//        а) Длине массива
        System.out.println("Длина массива: " + array.length);
//-------------------------------------------------------


//        б) Количестве чисел больше 8
        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                counter8++;
            }
        }
        System.out.println("Количестве чисел больше 8: " + counter8);
//-------------------------------------------------------


//        в) Количестве чисел равных 1
        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counter1++;
            }
        }
        System.out.println("Количестве чисел равных 1: " + counter1);
//-------------------------------------------------------


//        г) Количестве четных чисел
        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterEven++;
            }
        }
        System.out.println("Количестве четных чисел: " + counterEven);
//-------------------------------------------------------


//        д) Количестве нечетных чисел
        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counterOdd++;
            }
        }
        System.out.println("Количестве нечетных чисел: " + counterOdd);
//-------------------------------------------------------


//        е) Сумме всех элементов массива

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
