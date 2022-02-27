package Zaur_OOP.podpaket_lesson19.varargs;

public class Test3 {
    static void abc(){
        System.out.println("запуск метода внутри");
    }
    static void abcd(int ... b){
        int umn=1;
        for (int i = 0; i < b.length; i++) {
            umn *= b[i];
        }
        System.out.println(umn);
    }

    public static void main(String[] args) {
        abcd(2,5,6,8,2,9);
    }
}
