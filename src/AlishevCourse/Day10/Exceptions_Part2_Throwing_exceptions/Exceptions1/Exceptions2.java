package AlishevCourse.Day10.Exceptions_Part2_Throwing_exceptions.Exceptions1;
//Исключения (часть 2). Выбрасывание исключений.


import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner sc=new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(sc.nextLine());

            if (x!=0){
                throw new ScannerException("Пользователь ввел что то кроме нуля");
            }
        }
    }
}
