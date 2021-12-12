package AlishevCourse.Day10.Exceptions_Part1_Exception_handling;
//Исключения (часть 1). Обработка исключений.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file=new File("qeqwewqe");
//        Scanner sc=new Scanner(file);
//    }
        public static void main(String[] args) {
            File file=new File("test35");
            try {
                Scanner sc=new Scanner(file);
                System.out.println("после Scanner-выполнение блока try ");
            } catch (FileNotFoundException e) {
//                e.printStackTrace();
                //в случае если появится исключение
                System.out.println("Error.файл не найден");
            }
            //после блока try-catch код выполняется как обычно
            System.out.println("после блока....");

        }
}
