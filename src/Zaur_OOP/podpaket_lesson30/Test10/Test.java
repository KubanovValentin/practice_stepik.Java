package Zaur_OOP.podpaket_lesson30.Test10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//компилятор не пропустит такой код уккщк
public class Test {
    public static void main(String[] args) {
        int a = abc();
        System.out.println(a);//a=17
    }
    static int abc() {
        try {
            FileInputStream fis = new FileInputStream("с файлом которого нет");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
            return 17;
        } finally {
            System.out.println("это finally блок");
            return 16;
        }
//        System.out.println("программа продолжается");//анричибл стейтмант
//        return 18;
    }
}
