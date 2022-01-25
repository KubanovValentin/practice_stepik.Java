package JavaRushTaskSt.Zadachi_12.LV.Static_methods;

public class Test2 {

    public static void main(String[] args) {
        Test2 test2=new Test2();

        System.out.println(test2.min(7,5,3));

        int x=test2.min(10,4,54);
        System.out.println(x);
    }
    int min(int a, int b)
    {
        return a < b ? a : b;
    }

    int min(int a, int b, int c)
    {
        int t = min(a, b);
        return min(t, c);
    }

}
