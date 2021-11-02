package Zaur_OOP;

public class MetodOverloading2 {
    public int sum(int i1, int i2){

        return i1+i2;
    }


    protected String sum (String s1, String s2){

        return s1+s2;
    }

    protected void sum(int a,String b){

    }
}
class MetodOverloading2Test {
    public static void main(String[] args) {
        MetodOverloading2 mO2=new MetodOverloading2();


        int a = mO2.sum(5,7);
        System.out.println(a);
        String s = mO2.sum("привет"," мой друг");
        System.out.println(s);
    }
}