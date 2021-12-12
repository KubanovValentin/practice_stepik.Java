package AlishevCourse.Day10.Exceptions_Part1_Exception_handling.Test2;
//Исключения (часть 1). Обработка исключений.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("обработка исключения в методе main");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file=new File("test35");
        Scanner sc=new Scanner(file);
    }
}
