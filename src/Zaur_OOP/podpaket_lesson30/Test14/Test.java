package Zaur_OOP.podpaket_lesson30.Test14;

public class Test {
    public static void main(String[] args) {
        String [][]array={{"A","B","C"},null,{"d"},new String[8]};
        System.out.println(array);//[[Ljava.lang.String;@340f438e
        System.out.println(array[1]);//null
        System.out.println(array[0][2]);//C
        System.out.println(array[3][0]);//null
        System.out.println(array[3][5].length());//NullPointerException
    }
}
