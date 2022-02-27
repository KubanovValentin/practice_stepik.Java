package Zaur_OOP.podpaket_lesson19;

public class Test4 {
    public static void main(String[] args) {
        int[][]array={{3,1,8,4},{5,2},{1,9,5,2,0,6}};

//        for (int i=0;i< array.length;i++){
//            for (int j=0;j< array[i].length;j++){
//                System.out.print(array[i][j]+" ");
//            }
//        }
        for (int[]array2:array){
            for (int a:array2){
                System.out.print(a+" ");
            }
        }
    }
}
