package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions.Throwing_exceptions;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
public class Solution5FileUtils {
    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаем содержимое файла " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записываем данные в файл " + filePath);
    }
}
