package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;
//переполнения стека
public class Test8 {
    static void abc(){ //рекурсия метода или бесконечность
        System.out.println("work method abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        }catch (StackOverflowError e){
            System.out.println("\nerror caught");
        }

    }
}
