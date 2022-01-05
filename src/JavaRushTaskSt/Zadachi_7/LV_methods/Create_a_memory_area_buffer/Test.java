package JavaRushTaskSt.Zadachi_7.LV_methods.Create_a_memory_area_buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024*1024];
        FileInputStream sourceFile = new FileInputStream("c:\\data.txt");
        FileOutputStream destFile = new FileOutputStream("c:\\output.txt");
        while (true)
        {
            int size = sourceFile.read(buffer);   // читаем данные из файла в буфер
            destFile.write(buffer, 0, size);      // записываем данные из буфера в файл

            // прекращаем копирование, если буфер заполнен не полностью
            if (size < buffer.length) break;
        }
        sourceFile.close();
        destFile.close();
    }
}
