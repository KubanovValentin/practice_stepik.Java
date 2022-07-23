package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6_1_variant {
    void file(){
        File f = new File("test3");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("not error");
        }catch (FileNotFoundException e){
            System.out.println("error");
        }
    }
    void start(){
        System.out.println("start method file");
        file();
    }

    public static void main(String[] args) {

    }
}
