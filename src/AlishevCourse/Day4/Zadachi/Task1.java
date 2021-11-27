package AlishevCourse.Day4.Zadachi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrayLength= sc.nextInt();

        Random random=new Random();
//        random.nextInt(10);
        int[] array=new int[arrayLength];
        for (int i= 0;i<array.length;i++){
            array[i]=random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
//-------------------------------------------------------


//        а) Длине массива
        System.out.println(array.length);
//-------------------------------------------------------


//        б) Количестве чисел больше 8
        int counter8=0;
        for (int i=0;i<array.length;i++){
            if(array[i]>8){
                counter8++;
            }
        }
        System.out.println(counter8);
//-------------------------------------------------------


//        в) Количестве чисел равных 1
        int counter1=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==1){
                counter1++;
            }
        }
        System.out.println(counter1);
//-------------------------------------------------------


//        г) Количестве четных чисел
        int counterEven=0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
                counterEven++;
            }
        }
        System.out.println(counterEven);
//-------------------------------------------------------


//        д) Количестве нечетных чисел
        int counterOdd=0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                counterOdd++;
            }
        }
        System.out.println(counterOdd);
//-------------------------------------------------------


//        е) Сумме всех элементов массива

        int sum=0;
        for (int i=0;i<arrayLength;i++){
            sum+=array[i];
        }
        System.out.println(sum);


    }
}
