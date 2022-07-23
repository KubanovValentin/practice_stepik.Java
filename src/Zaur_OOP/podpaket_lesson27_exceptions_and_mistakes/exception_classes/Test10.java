package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;
import java.io.*;
public class Test10 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        try {
            File f=new File("D:\\Users\\13\\Desktop\\test2.txt");
            System.out.println("создался File f ");
            FileInputStream fis=new FileInputStream(f);
            System.out.println("создался поток");
            int counter=0;
            while (true){
                counter++;
                result.append(fis.read());
                System.out.println("информация читается и счетчик равен "+counter);
                if (counter==5){
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("исключение 1 - "+e);
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println("исключение 2 - "+e);
        }
        finally {
            System.out.println("finally block");
        }
    }
}
