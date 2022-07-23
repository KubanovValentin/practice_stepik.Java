package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;
import java.io.*;
public class Test9 {
    public static void main(String[] args) {
        try {
            File f=new File("D:\\Users\\13\\Desktop\\test.txt");
            FileInputStream fis=new FileInputStream(f);

        }catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        }catch (NullPointerException e){
            System.out.println("Exception 2");
        } catch (RuntimeException e) {
            System.out.println("Exception 3");
        }
    }
}
