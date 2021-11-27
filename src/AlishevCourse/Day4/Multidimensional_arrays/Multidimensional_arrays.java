package AlishevCourse.Day4.Multidimensional_arrays;

public class Multidimensional_arrays {
    public static void main(String[] args) {
    int[]number={1,2,3};//одномерный массив(линейный порядок числ)
//        System.out.println(number[1]);// указать лишь индекс
        //двумерный и далее массивы(матрицу чисел или таблицу чисел)
        /**
         * 1,2,3,4,5,0,-1,-2
         *
         * 1 5 6
         * 3 7 5 обратимся к 7 [1][1]
         * 2 6 8
        */

//        int[][] двумерный
//        int[][][] трёхмерный
//        int[][][][] четырехмерный

        int[][]matrice={{1,2,3,4,6},
                        {4},
                        {7,8}};
        System.out.println(matrice[2][1]);
        System.out.println(matrice[1][0]);
        System.out.println(matrice[0][4]);

//        ----------------------------------

        int [] numbers1=new int[5];
        String[][] strings=new String[2][3];
        strings[0][1]="Привет";
        System.out.println(strings[0][1]);
    }
}
