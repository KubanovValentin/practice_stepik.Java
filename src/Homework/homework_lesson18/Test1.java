package Homework.homework_lesson18;

import java.util.Arrays;

public class Test1 {
    public static void sortirovka(int[]array){
//        for (int i=0;i< array.length;i++){
//
//        }
        Arrays.sort(array);
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int array[]={1,9,-7,0,2,5};
        sortirovka(array);
    }
}
