package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;
import java.io.*;
public class Test2 {
    public static void main(String[] args) {
        File f = new File("test3");
        try {
            FileInputStream fis =new FileInputStream(f);
            System.out.println("123");
        }
        catch (FileNotFoundException e) {
            System.out.println("was caught Exception  -  :" + e);
        }finally {
            System.out.println("finally block");
        }
    }
}
