package Zaur_OOP.podpaket_lesson18_Array;

public class Test {
    public static void main(String[] args) {
        int [] array1;
        String [] array2;
        double [][] array3;
        int [][]array10;
        double[]array7;

        array1=new int[10];
        array3=new double[4][2];
        array2=new String[3];
        array10=new int[5][];
        array7=new double[2];


        System.out.println(array2.length);

        array2[0]="privet";
        array2[1]="polka";
        array2[2]="ok";

        double[]array5;
        array5=new double[2];
        array5[0]=2.5;
        array5[1]=4.5;
        array7=array5;
        array3[1]=array5;
        array3[2]=array7;
        System.out.println(array3[1][0]);

    }
}
