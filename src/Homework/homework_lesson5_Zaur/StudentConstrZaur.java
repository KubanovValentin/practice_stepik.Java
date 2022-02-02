package Homework.homework_lesson5_Zaur;


//измените класс Student так, чтобы он имел 3 конструктора.
// 1 принимает все параметры.
// 2 только id, name, surname, course.
// 3 не принимает значений.
// создайте в классе StudentTest 3 объекта с помощью разных конструкторов.


public class StudentConstrZaur {
    StudentConstrZaur
            (int studentId1,
             String name1,
             String surname1,
             int birthday1,
             int curse1,
             double mathAverageGrade1,
             double economicsAverageGrade1,
             double foreignLanguageAverageGrade1,
             String profess1) {
        studentId = studentId1;
        name = name1;
        surname = surname1;
        birthday = birthday1;
        curse = curse1;
        mathAverageGrade = mathAverageGrade1;
        economicsAverageGrade = economicsAverageGrade1;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade1;
        profess = profess1;
    }

    StudentConstrZaur(int studentId2, String name2, String surname2, int curse2) {
        this(studentId2,
                name2,
                surname2,
                0,
                curse2,
                0.0,
                0.0,
                0.0,
                null);
    }
    StudentConstrZaur(){
        System.out.println("Ждем.....");
    }
    int studentId;
    String name;
    String surname;
    int birthday;
    int curse;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
    String profess;
}
class StudentConstrZaurTest{
    double sredArifmOcenka(StudentConstrZaur st){
        double sredOzenka=(st.mathAverageGrade+st.economicsAverageGrade+st.foreignLanguageAverageGrade)/3;
        System.out.println("Средняя арифмитическая оценка студента" + st.name+st.surname+": "+sredOzenka);
        return sredOzenka;
    }

    public static void main(String[] args) {
        StudentConstrZaur st1=new StudentConstrZaur();
        st1.studentId=12;
        st1.name="Jon";
        st1.surname="Hogart";
        st1.birthday=1996;
        st1.curse=5;
        st1.mathAverageGrade=8.7;
        st1.economicsAverageGrade=6.3;
        st1.foreignLanguageAverageGrade=5.9;
        st1.profess="Electric";

        StudentConstrZaur st2=new StudentConstrZaur(23,"Jek","Travolt",1);
        st2.birthday=1999;
        st2.mathAverageGrade=6.3;
        st2.economicsAverageGrade=3.9;
        st2.foreignLanguageAverageGrade=9.1;
        st2.profess="IT";

        StudentConstrZaur st3=new StudentConstrZaur(
                2,
                "Anton",
                "Markovich",
                1992,
                2,
                5.9,
                7.2,
                9.4,
                "ingeneer");


        StudentConstrZaurTest sTest=new StudentConstrZaurTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);

    }

}
