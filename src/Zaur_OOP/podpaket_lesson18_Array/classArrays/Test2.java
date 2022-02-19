package Zaur_OOP.podpaket_lesson18_Array.classArrays;

public class Test2 {
    public static void main(String[] args) {
        int array1[]={1,9,-7,0,2,5};
        int array2[]={1,9,-7,0,2,5};
        int array3[]=array2;
        System.out.println(array1==array2);//false
        System.out.println(array2==array3);//true
        System.out.println(array1.equals(array2));//false
        System.out.println(array2.equals(array3));//true
        array1[0]=23;
        array1[5-3]=25;
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}
