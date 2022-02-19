package Zaur_OOP.podpaket_lesson18_Array.classArrays;

public class Test3 {
    public static void maxMin(double []array){
        double max=array[0];
        double min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("минимальный элемент массива: "+min+" "+"максимальный элемент массива: "+max);
    }

    public static void main(String[] args) {
        double []array1={1.56,3.5,12.02,9.6,4.89,4.0,87.7,-34.78};
        maxMin(array1);

        maxMin(new double[]{3.4,-5.0,3.9,1.09});
    }
}
