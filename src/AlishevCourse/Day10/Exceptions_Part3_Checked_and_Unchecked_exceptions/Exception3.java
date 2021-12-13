package AlishevCourse.Day10.Exceptions_Part3_Checked_and_Unchecked_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        //Checked Exception(Compile time exception) - проверенный или проверяемый
        //      (которые возникают во время компиляции) = исключительные случаи в работе программы

//        File file=new File("test");
//        try {
//            Scanner sc=new Scanner(file);
//        } catch (FileNotFoundException e) {
//            //дадим знать ооб ошибке пользователю
//            System.out.println("ERROR!!!");
//        }
//--------------------------------------------------
        //Unchecked (Runtime exception)-
        // (это те исключения которые возникают во время выполнения программы)=ошибка работы программы(ее надо исправлять)

//        int a=1/0;

//        String name=null;
//        name.length();

//        int[] arr=new int[2];// 0 1 2(нет т.к их всего лишь 2 элемента)
//        System.out.println(arr[2]);

    }
}
