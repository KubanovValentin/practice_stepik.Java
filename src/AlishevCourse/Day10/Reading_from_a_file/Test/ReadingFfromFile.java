package AlishevCourse.Day10.Reading_from_a_file.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//поток - мы подаем что то на вход, считывается сканером и помещается в переменную
public class ReadingFfromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //один из способов считывания является сканер он один из простых
        //создаем файл чтоб соответствовал считывающему файлу
        String separator = File.separator;
        // "D:\\Users\\13\\Desktop\\test.txt"
        String path = "D:" + separator + "Users" + separator + "13" + separator + "Desktop" + separator + "test.txt";
//        String path="D:\\Users \\ 13 \\ Desktop \\ test.txt"; не работает
        File file = new File(path);


        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
//         ВАЖНО!!!!!закрывать сканер
        sc.close();

    }
}
