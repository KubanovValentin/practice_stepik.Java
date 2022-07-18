package JavaRushTaskSt.Zadachi_16.LV.the_try_with_resources_statement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//Длинный код
public class Test2 {
    public static void main(String[] args) throws IOException {
//        String src = "D:\\Users\\13\\Desktop\\test.txt";
//        String dest = "D:\\Users\\13\\Desktop\\test2.txt";
//
//        FileInputStream input = null;
//        FileOutputStream output = null;
//
//        try
//        {
//            input = new FileInputStream(src);
//            output = new FileOutputStream(dest);
//
//            byte[] buffer = input.readAllBytes();
//            output.write(buffer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally
//        {
//            if (input != null)
//                input.close();
//            if (output != null)
//                output.close();
//        }

//---------------------------------------------
        //Короткий код
        /*
        String src = "c:\\projects\\log.txt";
String dest = "c:\\projects\\copy.txt";

try(FileInputStream input = new FileInputStream(src);

FileOutputStream output = new FileOutputStream(dest))
{
   byte[] buffer = input.readAllBytes();
   output.write(buffer);
}
         */
    }
}
