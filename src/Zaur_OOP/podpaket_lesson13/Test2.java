package Zaur_OOP.podpaket_lesson13;

public class Test2 {
}
class Student1{
    int grade;

    public Student1(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student1 student1=new Student1(3);
        switch (student1.grade){
            case 2:
                System.out.println("студент двоечник");
                break;
            case 3:
                System.out.println("студент троечник");
                break;
            case 4:
                System.out.println("студент хорошист");
                break;
            case 5:
                System.out.println("студент отличник");
                break;
            default:
                System.out.println("оценка отрицательная");
        }
    }
}