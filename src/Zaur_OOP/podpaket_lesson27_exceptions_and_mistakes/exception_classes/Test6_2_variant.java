package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6_2_variant {
    void file()throws FileNotFoundException{
        File f = new File("test3");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("not error");
    }
    void start(){
        System.out.println("start method file");
        try {
            file();
        }catch (FileNotFoundException e){
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Test6_2_variant t=new Test6_2_variant();
        t.start();
    }
}
