package JavaRushTaskSt.Zadachi_16.LV.thread_chains;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String src = "D:\\Users\\13\\Desktop\\test.txt";
        FileInputStream input = new FileInputStream(src);
        InputStreamReader reader = new InputStreamReader(input);
    }
}
