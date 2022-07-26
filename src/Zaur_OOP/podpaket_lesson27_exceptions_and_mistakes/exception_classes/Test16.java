package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

public class Test16 {
    void abc(){
        int[]array={1,4,8};
        try {
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            String s=null;
            try {
                System.out.println(s.length());
            }catch (NullPointerException e1){
                System.out.println("NullPointerException ");
            }
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Test16 t16=new Test16();
        t16.abc();
    }
}
