package Zaur_OOP.podpaket_lesson30.Test26;

public class Test {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        int i = 5;
        try {
            array[abc()][i = 0]++;//abc() который выбрасывает throw new Exception(); и на этом все.[i = 0]++ не выполн.
        } catch (Exception e) {//ловит throw new Exception()
            System.out.println(i + " " + array[1][1]); //выводит 5 4
        }
    }

    static int abc() throws Exception {
        throw new Exception();
    }
}
