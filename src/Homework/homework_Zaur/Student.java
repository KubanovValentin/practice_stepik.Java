package Homework.homework_Zaur;
//измените класс StudentTest так,чтобы среднюю арифмитическую оценку студента выводил на экран метод.
// т.е создайте 1 метод параметр которого - это объект класса Student,
// а в теле метода будет вычисляться средняя арифмитическая оценка и выводиться на экран
public class Student {
    int studentId;
    String name;
    String surname;
    int curse;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

}
class StudentTest{
   double sredArifOcenka(Student st){
       double sredOcenka=(st.mathAverageGrade+st.economicsAverageGrade+st.foreignLanguageAverageGrade)/3;
       System.out.println("Средняя арифметическая оценка студента "+st.name+" "+st.surname+": "+sredOcenka);
       return sredOcenka;
   }

    public static void main(String[] args) {
        Student st1=new Student();
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
        st2.economicsAverageGrade = 3.9;
        st2.foreignLanguageAverageGrade = 5.9;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Valek";
        st3.surname = "Vubanov";
        st3.curse = 2;
        st3.mathAverageGrade = 4.0;
        st3.economicsAverageGrade = 7.8;
        st3.foreignLanguageAverageGrade = 6.2;

        StudentTest sTest=new StudentTest();
        sTest.sredArifOcenka(st1);
        sTest.sredArifOcenka(st2);
        sTest.sredArifOcenka(st3);
    }

}
