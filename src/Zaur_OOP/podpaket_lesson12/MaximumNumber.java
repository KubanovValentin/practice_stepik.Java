package Zaur_OOP.podpaket_lesson12;

public class MaximumNumber {
    void maximum(int i1,int i2,int i3){
        if(i1>i2&&i1>i3){
            System.out.println("максимальное число = "+i1);
        }else if(i2>i1&&i2>i3){
            System.out.println("максимальное число = "+i2);
        }else {
            System.out.println("максимальное число = "+i3);
        }
    }

    public static void main(String[] args) {
        MaximumNumber maximumNumber=new MaximumNumber();
        maximumNumber.maximum(2,7,3);
    }
}
