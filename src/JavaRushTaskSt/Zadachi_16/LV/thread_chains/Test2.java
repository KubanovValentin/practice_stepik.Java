package JavaRushTaskSt.Zadachi_16.LV.thread_chains;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        String src = "D:\\Users\\13\\Desktop\\test.txt";

        try (FileReader in = new FileReader(src);//Создаем объект FileReader, источник данных — файл.
             BufferedReader reader = new BufferedReader(in)) {//Создаем объект BufferedReader,
                                                              // источник данных — объект FileReader;
            while (reader.ready()) {                          //пока в reader еще есть данные
                String line = reader.readLine();              //Прочитать одну линию
                System.out.println(line);                     //Вывести линию на экран
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
