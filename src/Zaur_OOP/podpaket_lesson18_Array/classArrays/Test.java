package Zaur_OOP.podpaket_lesson18_Array.classArrays;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int array1[]={1,9,-7,0,2,5};
        System.out.print("это неотсортированный массив : ");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }

        System.out.println();
        System.out.print("это отсортированный массив : ");
        Arrays.sort(array1);//метод сортировки
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        // метод поиска индекса в массиве
        System.out.println();
        int index1=Arrays.binarySearch(array1,1);//самый простой и эффективный способ найти элемент в отсортированном массиве
        System.out.println(index1);
    }
}
