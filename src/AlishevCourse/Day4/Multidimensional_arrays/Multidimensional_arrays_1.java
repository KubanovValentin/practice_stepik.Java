package AlishevCourse.Day4.Multidimensional_arrays;

public class Multidimensional_arrays_1 {
    public static void main(String[] args) {
        int[][]matrice={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        for (int i=0;i<matrice.length;i++){//matrice.length равно 3 т.к у нас 3 массива(внешний цикл)
            for (int j=0;j<matrice[i].length;j++){//внутренний цикл
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
