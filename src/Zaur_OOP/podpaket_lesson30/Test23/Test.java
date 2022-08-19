package Zaur_OOP.podpaket_lesson30.Test23;

public class Test {
    public static void main(String[] args) {
        //array1 ссылаеться на [2] двумерного массива
        String array1[]=new String[][]{new String[]{"privet","poka","ok"},{new String()},{null}}[2];
        String array2[]={null};
        String array3[]=null;
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        System.out.println(array3[0]);//.NullPointerException
    }
}
