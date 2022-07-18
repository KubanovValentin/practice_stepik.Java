package JavaRushTaskSt.Zadachi_16.LV.the_try_with_resources_statement;

import java.io.FileOutputStream;

//3. try-with-resources
public class Test1 {
    public static void main(String[] args) {


    }
}
//Длинный код
/*
FileOutputStream output = null;

try
{
   output = new FileOutputStream(path);
   output.write(1);
}
finally
{
   if (output != null)
   output.close();
}
 */

//Код с try-with-resources
/*
try(FileOutputStream output = new FileOutputStream(path))
        {
            output.write(1);
        }
 */