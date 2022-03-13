package Zaur_OOP.podpaket_lesson22_Inheritance;

public class Test2 {
}

class Human1 {
    Human1(String n) {
        this(n, null);
    }

    public Human1(String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;
}

class Student1 extends Human1 {
    Student1() {
        this(5);
        System.out.println("by");
    }

    Student1(int i) {
        super(":)");
    }
//    Student1(){
//        super(":)");
//    }
//    Student1(int i){
//        this();
//        System.out.println("hello");
//    }
//    public Student1(String n) {
//        super(n);
//    }
//
//    public Student1(String n, String s) {
//        super(n, s);
//    }

    public static void main(String[] args) {
        Student1 s = new Student1();
//        Student1 s=new Student1(5);
        //       s.name="Vasek";
//        System.out.println(s.name);
    }
}