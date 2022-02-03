package Zaur_OOP.podpaket_lesson11;

public class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student s1,Student s2){
        Student s3=s1;
        s1=s2;
        s2=s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
    //видимость этих локальных переменных только в методе и они живы только там
    }
    public static void changeName(Student s4){
        s4.name="Vanek";
    }
    public static void main(String[] args) {
        Student st1=new Student("Ivan",3,9.5);
        Student st2=new Student("Pert",1,5.3);
//        Student st3;
//        st3=st1;
//        st1=st2;
//        st2=st3;
//        System.out.println(st1.name);
//        System.out.println(st2.name);
        swap(st1,st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);
    }
}
