package JavaRushTaskSt.Zadachi_6.LV_array.MultidimensionalArrays;

public class Solution {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
//        multiArray[0]=new int[][]{{4, 8, 15}, {16}};
//        multiArray[1]=new int[][]{{23, 42}, {}};
//        multiArray[2]=new int[][]{{1}, {2}, {3}, {4, 5}};
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");
        }
    }
}
