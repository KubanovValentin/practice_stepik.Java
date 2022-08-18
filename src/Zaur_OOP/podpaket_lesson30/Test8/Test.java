package Zaur_OOP.podpaket_lesson30.Test8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        int a = abc();
        System.out.println(a);//a=18
    }

    static int abc() {
        try {
            FileInputStream fis = new FileInputStream("с файлом которого нет");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        } finally {
            System.out.println("это finally блок");
        }
        System.out.println("программа продолжается");
        return 18;
    }
}
