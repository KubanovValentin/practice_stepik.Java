package Homework.homework_lesson23_test.p2;

import Homework.homework_lesson23_test.p1.*;

public class Y extends X {
    Y() {
        super();
    }
    public void abc(){
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y=new Y();
        y.abc();
    }
}
