package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test13 {
    void abc() throws FileNotFoundException{
        try {
            File f = new File("test3");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("code work");

        } catch (FileNotFoundException e) {
            System.out.println("exception caught and a little processing");
            throw e;

        } finally {
            System.out.println("finally block");
        }
    }
    void method(){
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("exception caught and a completely processing");
        }

    }
//    void def() {
//        try {
//            int [] array={1,6,7};
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("exception caught and a little processing");
//            throw e;
//
//        } finally {
//            System.out.println("finally block");
//        }
//    }

    public static void main(String[] args) throws FileNotFoundException {
        Test13 t13=new Test13();
        t13.abc();
    }
}
