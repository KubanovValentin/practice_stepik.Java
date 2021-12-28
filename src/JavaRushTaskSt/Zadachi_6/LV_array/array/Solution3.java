package JavaRushTaskSt.Zadachi_6.LV_array.array;
/*
Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
если значение этого элемента чётное.
 */
public class Solution3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) {


//        for (int i=0;i<5;i++){
//            if (i%2==0){
//                if (array[i]<0){
//                    array[i]*=-1;
//                }else {
//                    array[i]*=-1;
//                }
//            }
//        }

//        -----------------------------------

        if (array[0] % 2 == 0) {
            array[0] = -array[0];
        }
        if (array[1] % 2 == 0) {
            array[1] = -array[1];
        }
        if (array[2] % 2 == 0) {
            array[2] = -array[2];
        }
        if (array[3] % 2 == 0) {
            array[3] = -array[3];
        }
        if (array[4] % 2 == 0) {
            array[4] = -array[4];
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);


    }
}
