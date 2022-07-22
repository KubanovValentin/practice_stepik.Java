package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        File f = new File("text9.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
        } catch (FileNotFoundException e) {
            System.out.println("Exception = " + e);
        } catch (IOException e1) {
            System.out.println("Exception = " + e1);
        }
    }
}
