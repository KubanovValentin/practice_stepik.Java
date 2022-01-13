package JavaRushTaskSt.Zadachi_10.LV.Checking_the_file_path;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//Создание объекта Scanner
        String path = console.nextLine();//Чтение строки с консоли

        if (path.endsWith(".jpg") || path.endsWith(".jpeg")){ //Проверяем, что строка path оканчивается на заданную строку
            System.out.println("Это Jpeg!");
        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
            System.out.println("Это HTML-страница");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("Это документ Word");
        } else {
            System.out.println("Неизвестный формат");
        }
    }
}
