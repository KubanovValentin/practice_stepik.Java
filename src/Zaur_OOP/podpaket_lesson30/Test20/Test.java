package Zaur_OOP.podpaket_lesson30.Test20;

public class Test {

}
class Tiger{
    static int count=0;
}
class TestTiger{
    public static void main(String[] args) {
        boolean flag=false;
        while (flag=true){
            Tiger.count++;
        }//infinite loop(бесконечный цикл)
        System.out.println(Tiger.count);
    }
}