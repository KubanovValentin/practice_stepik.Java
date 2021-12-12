package AlishevCourse.Day10.Reading_from_a_file.Test2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// считаем в файле строку(с числами) переведем из стринга в примитив
public class ReadingFfromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "D:" + separator + "Users" + separator + "13" + separator + "Desktop" + separator + "test2.txt";
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String line=sc.nextLine();
        String[]numbersString=line.split(" ");
        // метод split на чем разделяет и выводит в массив
        //это считается строчным массивом и поэтому нам надо перевести в числовой массив
        int[]numbers=new int[4];
        int counter=0;
        for (String number:numbersString){
            numbers[counter++]=Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
