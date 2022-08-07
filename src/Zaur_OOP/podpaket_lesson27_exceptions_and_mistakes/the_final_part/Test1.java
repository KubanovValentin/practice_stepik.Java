package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.the_final_part;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        Animal a=new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            System.out.println("exeption poiman");
        }
    }
}

class Animal {
    void run() throws IOException {
        System.out.println("animal runs");
    }
}

class Mouse extends Animal {
    void run() {
        System.out.println("mouse runs");
    }
}