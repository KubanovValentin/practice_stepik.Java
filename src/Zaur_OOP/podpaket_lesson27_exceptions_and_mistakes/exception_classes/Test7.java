package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

public class Test7 {
    void abc() {
        int[] array = {1, 3};
        System.out.println(array[4]);
    }

    void def() throws ArrayIndexOutOfBoundsException {
        abc();
    }

    public static void main(String[] args) {
        Test7 t7 = new Test7();
        try {
            t7.def();
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("error = " + e);
//              System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
