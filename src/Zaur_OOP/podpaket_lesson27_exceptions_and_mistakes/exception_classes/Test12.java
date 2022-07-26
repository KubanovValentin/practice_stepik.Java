package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Test12 {


    static StringBuilder abc() {
        StringBuilder a=new StringBuilder("hello");
        try {
            File f = new File("test3");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("code work");

        } catch (FileNotFoundException e) {
            System.out.println("exception caught");
            System.out.println("peremenaya a v block  catch = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("finally block");
            System.out.println("peremenaya a v finally  catch = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }
}
