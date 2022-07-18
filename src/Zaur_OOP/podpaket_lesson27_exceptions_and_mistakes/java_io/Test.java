package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.java_io;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File f = new File("test3");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(88);
        fos.write(100);
        fos.write(90);
        fos.write(76);



    }
}
