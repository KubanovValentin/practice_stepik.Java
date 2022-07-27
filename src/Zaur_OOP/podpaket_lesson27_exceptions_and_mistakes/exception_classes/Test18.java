package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;
import java.io.*;
public class Test18 {
   static FileInputStream fis1,fis2;

    public static void main(String[] args) {
        try {
            fis1=new FileInputStream("test3");
            System.out.println("file test3 exists and found");
            try {
                fis2.close();
            }catch (IOException e){
                System.out.println("is not work and problems is stream fis2");
            }
        }catch (FileNotFoundException e){
            System.out.println("file test3 is not found");
        }catch (NullPointerException e){
            System.out.println("work NullPointerException");
        }
    }
}
