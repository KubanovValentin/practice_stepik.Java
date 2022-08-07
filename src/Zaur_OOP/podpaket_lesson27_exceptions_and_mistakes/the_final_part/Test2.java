package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.the_final_part;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws Throwable {
        Animal2 a2 = new Mouse2();

    }
}

class Animal2 {
    Animal2() throws FileNotFoundException {

    }
}

class Mouse2 extends Animal2 {
    Mouse2() throws IOException, FileNotFoundException, IOException, ArrayIndexOutOfBoundsException {
        super();
    }
}
class Human{
    String name;
    int age;
    Human(String name,int age) throws Exception {
        if (age<0){
            throw new Exception("age does not match");
        }
        this.name=name;
        this.age=age;

    }
}