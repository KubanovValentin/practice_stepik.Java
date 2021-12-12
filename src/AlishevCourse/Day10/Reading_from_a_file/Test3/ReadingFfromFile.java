package AlishevCourse.Day10.Reading_from_a_file.Test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFfromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test3");

        Scanner sc = new Scanner(file);
        String line=sc.nextLine();
        String[]numbersString=line.split(" ");
        int[]numbers=new int[5];
        int counter=0;
        for (String number:numbersString){
            numbers[counter++]=Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
