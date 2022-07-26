package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

import java.io.*;

public class Test15 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test3");
            try {
                fis2 = new FileInputStream("test3");
            } catch (FileNotFoundException e) {
                System.out.println("file test1 not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file test2 not found");
        } finally {
            System.out.println("external finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("found Exception in finally block");
            }
        }
    }

    public static void main(String[] args) {
        Test15 t15=new Test15();
        t15.abc();
    }
}
