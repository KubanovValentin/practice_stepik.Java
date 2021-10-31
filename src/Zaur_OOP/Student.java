package Zaur_OOP;

public class Student {
    int studentId;
    String name;
    String surname;
    int curse;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Vanek";
        st1.surname = "Vasenin";
        st1.curse = 1;
        st1.mathAverageGrade = 5.6;
        st1.economicsAverageGrade = 6.4;
        st1.foreignLanguageAverageGrade = 3.9;


        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Valera";
        st2.surname = "Vinakur";
        st2.curse = 4;
        st2.mathAverageGrade = 7.6;
        st2.economicsAverageGrade = 3.4;
        st2.foreignLanguageAverageGrade = 5.9;


        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Valek";
        st3.surname = "Vubanov";
        st3.curse = 2;
        st3.mathAverageGrade = 3.6;
        st3.economicsAverageGrade = 7.8;
        st3.foreignLanguageAverageGrade = 5.2;

        System.out.println("Средняя арифметическая оценка студента " + st1.name + " " + st1.surname + " = " +
                (st1.foreignLanguageAverageGrade + st1.mathAverageGrade + st1.economicsAverageGrade) / 3);

        System.out.println("Средняя арифметическая оценка студента " + st2.name + " " + st2.surname + " = " +
                (st2.foreignLanguageAverageGrade + st2.mathAverageGrade + st2.economicsAverageGrade) / 3);

        System.out.println("Средняя арифметическая оценка студента " + st3.name + " " + st3.surname + " = " +
                (st3.foreignLanguageAverageGrade + st3.mathAverageGrade + st3.economicsAverageGrade) / 3);
    }
}