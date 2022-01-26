package homework_lesson5_Zaur;

//измените класс Student так, чтобы он имел 3 конструктора.
// 1 принимает все параметры.
// 2 только id, name, surname, course.
// 3 не принимает значений.
// создайте в классе StudentTest 3 объекта с помощью разных конструкторов.


public class StudentConstr {
    StudentConstr() {
        System.out.println("Ждем.....");
    }

    StudentConstr(int studentId2, String name2, String surname2, int curse2) {
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

    StudentConstr
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

class StudentConstrTest {
    public static void main(String[] args) {
        StudentConstr st1 = new StudentConstr(
                12,
                "Jon",
                "Hogart",
                1996,
                5,
                8.7,
                6.3,
                5.9,
                "Electric");
        System.out.println(
                "Этот студент: "
                        + st1.surname
                        + " "
                        + st1.name
                        + " имеет id.номер - "
                        + st1.studentId
                        + ", "
                        + st1.birthday
                        + "год рождения"
                        + "\nКоторый учиться на "
                        + st1.curse
                        + " курсе"
                        + " и будущая профессия его " +
                        st1.profess);
        System.out.println();

        StudentConstr st2 = new StudentConstr(23, "Jek", "Travolt", 1);
        System.out.println("Этот студент: " + st2.name + " " + st2.surname + " только поступил на курс " + st2.curse);
        System.out.println();
        StudentConstr st3 = new StudentConstr();
    }
}