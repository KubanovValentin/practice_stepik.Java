package JavaRushTaskSt.Zadachi_7.LV_methods.Function_Parameters;

public class Test {
    public static void printLines(String text, int count)//Объявили метод printLines с параметрами: String text, int count
    {
        for (int i = 0; i < count; i++)//Метод выводит на экран count раз строку text
            System.out.println(text);
    }

    public static void main(String[] args)
    {
        // Вызываем метод printLines с разными параметрами
        // Вызываем метод printLines с параметрами
        // text = "Привет"; count = 10;
        // text = "Пока"; count = 20;
        printLines("Привет", 10);
        printLines("Пока", 20);
    }
}
