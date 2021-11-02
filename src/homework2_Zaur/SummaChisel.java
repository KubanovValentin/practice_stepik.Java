package homework2_Zaur;

public class SummaChisel {
    double summa(double a,double b){
        return a+b;
    }

    double summa(int a,double b){
        return a+b;
    }

    int summa(int a,int b,int c){
        return a+b+c;
    }

    double summa(int a,int b,int c,double a1){
        return a+b+c+a1;
    }

    String summa (String a,String b){
        return a+b;
    }

}
class SummaChiselTest{
    public static void main(String[] args) {
        SummaChisel mO1=new SummaChisel();
        double a = mO1.summa(0.0,0.0);
        System.out.println(a);

        SummaChisel mO2=new SummaChisel();
        double b = mO2.summa(1,0);
        System.out.println(b);

        SummaChisel mO3=new SummaChisel();
        int c = mO2.summa(1,1,3);
        System.out.println(c);

        SummaChisel mO4=new SummaChisel();
        double a1= mO4.summa(1,3,4,8.9);
        System.out.println(a1);

        SummaChisel mO5=new SummaChisel();
        String s= mO5.summa("Privet", " nub");
        System.out.println(s);
    }
}