package JavaRushTaskSt.Zadachi_4.LV;

public class Test {
    public static void main(String[] args) {
        int i = 1;
        while (i < 20)
        {
            i++;
            if ( (i % 7) == 0)
                continue;
            System.out.println(i);
        }
    }
}