package Zaur_OOP.podpaket_lesson13;

public class Test1 {

}


class Student{
    double grade;

    public Student(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1=new Student(4);
        if (st1.grade==2){
            System.out.println("студент двоечник");
        }else if (st1.grade==3){
            System.out.println("студент троечник");
        }else if (st1.grade==4){
            System.out.println("студент хорошист");
        }else if (st1.grade==5){
            System.out.println("студент отличник");
        }else {
            System.out.println("оценка отрицательная");
        }
                
    }
}