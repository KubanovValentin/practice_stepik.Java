package Zaur_OOP.podpaket_lesson29.lambda_expressions_1;

import java.util.ArrayList;

public class Test1 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", пол " + st.sex +
                ", возраст: " + st.age + ", курс: " + st.course + ", средняя оценка: " + st.avgGrade);
    }
    void testStudents(ArrayList<Student> aL, StudentChecks sc){
        for (Student s:aL){
            if (sc.testStudent(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Иван", 'м', 22, 3, 8.5);
        Student st2 = new Student("Николай", 'м', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'ж', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'м', 35, 4, 7);
        Student st5 = new Student("Мария", 'ж', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        System.out.println("------------------------FindStudentsOverGrade------------------------------------------------------");
        FindStudentsOverGrade fsog=new FindStudentsOverGrade();
        si.testStudents(list,fsog);
        System.out.println("------------------------FindStudentsUnderGrade------------------------------------------------------");
        FindStudentsUnderGrade fsug=new FindStudentsUnderGrade();
        si.testStudents(list,fsug);
        System.out.println("------------------------FindStudentsOverAge------------------------------------------------------");
        FindStudentsOverAge fsoa=new FindStudentsOverAge();
        si.testStudents(list,fsoa);
        System.out.println("------------------------FindStudentsUnderAge------------------------------------------------------");
        FindStudentsUnderAge fsua=new FindStudentsUnderAge();
        si.testStudents(list,fsua);
        System.out.println("------------------------FindStudentsBySex------------------------------------------------------");
        FindStudentsBySex bs=new FindStudentsBySex();
        si.testStudents(list,bs);
        System.out.println("------------------------FindStudentsMixCondition------------------------------------------------------");
        FindStudentMixCondition mc=new FindStudentMixCondition();
        si.testStudents(list,mc);
        System.out.println("------------------------------------------------------------------------------");

    }
}

interface StudentChecks {
    boolean testStudent(Student s);
}

class FindStudentsOverGrade implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade > 8.5;
    }
}
class FindStudentsUnderGrade implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade < 8;
    }
}
class FindStudentsOverAge implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.age > 25;
    }
}
class FindStudentsUnderAge implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.age < 25;
    }
}
class FindStudentsBySex implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.sex != 'м';
    }
}
class FindStudentMixCondition implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return (s.avgGrade >  8.8 && s.age < 20 && s.sex == 'ж');
    }
}