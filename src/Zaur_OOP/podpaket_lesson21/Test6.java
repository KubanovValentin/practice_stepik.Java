package Zaur_OOP.podpaket_lesson21;

public class Test6 {
    int abc(){
        return 5;
    }
    int abc2(int i){
        if(i>10){
            return 5;
        }else {
            return 10;
        }
    }
    void abc3(int i2){
        if (i2>3){
            return;//это закончит работу метода
        }
        System.out.println("hello");
        return;//нет смысла но после писать невозможно
    }
    public static void main(String[] args) {
        int a=new Test6().abc();
        System.out.println(a);
        new Test6().abc();
    }
}
