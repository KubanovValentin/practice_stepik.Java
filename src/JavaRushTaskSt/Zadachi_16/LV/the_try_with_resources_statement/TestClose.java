package JavaRushTaskSt.Zadachi_16.LV.the_try_with_resources_statement;
//2. Метод close()
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestClose {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Users\\13\\Desktop\\test.txt";
       FileOutputStream output = null;
//        output.write(100);
//        output.close();

        try
        {
            output = new FileOutputStream(path);
            output.write('5');
            output.write('p');
            output.write('r');
            output.write('i');
            output.write('v');
            output.write('e');
            output.write('t');
            output.write(23);
            output.write(31);
            output.write(124);
            output.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (output != null)
                output.close();
        }
    }
}
