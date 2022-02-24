package Homework.homework_lesson18;

import java.util.Arrays;

public class Test2 {
    public static void showArray(String[][]array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(Arrays.toString(new String[]{array[i][j]}));

            }
        }
    }
    public static void main(String[] args) {
        String[][]array=new String[3][];
        String[]array1={"элемент00","элемент01"};
        String[]array2={"элемент10"};
        String[]array3={"элемент10","элемент11"};
        array[0]=array1;
        array[1]=array2;
        array[2]=array3;
        showArray(array);
    }
}
