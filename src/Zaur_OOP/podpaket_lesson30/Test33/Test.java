package Zaur_OOP.podpaket_lesson30.Test33;

public class Test {
    public static void main(String[] args) {
        int[]array1={-3,2,0,8,1};
        int[]array2={9,0,4,-10};
        System.out.println(array1[(array1=array2)[1]]);//array1([(array1={9,0,4,-10})[1])->array1[0]->-3
    }
}
