package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;
import java.io.*;
public class Test2 {
    public static void main(String[] args) {
        File f = new File("test3");
        try {
            FileInputStream fis =new FileInputStream(f);
            System.out.println("file exist and code it worked");
        }catch (FileNotFoundException e) {
            System.out.println("was caught Exception  -  :" + e);
        }catch (NullPointerException e1){
            System.out.println("was caught Exception  -  :" + e1);
        }finally {//можно не писать необязательный
            System.out.println("finally block and always is worked");
        }
    }
}
