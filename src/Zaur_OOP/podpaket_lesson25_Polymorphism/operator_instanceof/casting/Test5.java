package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting;

public class Test5 {
    public static void main(String[] args) {
        String[] array1 = {"hello,by"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
//        array3[0]=new StringBuilder("ok");
//        array2[0] = new StringBuilder("ok");
    }
}
