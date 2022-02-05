package Zaur_OOP.podpaket_lesson12;

public class Test2 {
    static void abc(){
        String str;
        int a=5;
        if (a>=10){
            str="Hello";
        }else if (a<10){
            str="By By";
        }else { //если не будет else то компилятор не увидет str
            str=null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        abc();
    }
}
