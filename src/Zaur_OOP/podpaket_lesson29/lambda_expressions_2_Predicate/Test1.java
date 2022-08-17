package Zaur_OOP.podpaket_lesson29.lambda_expressions_2_Predicate;

import java.util.ArrayList;
import java.util.function.*;

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
    void testStudents(ArrayList<Student> aL, Predicate<Student> t){
        for (Student s:aL){
            if (t.test(s)){
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
        si.testStudents(list,(Student st)->{return st.avgGrade > 8.5;});
        System.out.println("---------");
        si.testStudents(list,st->st.avgGrade <7);
        System.out.println("------------------------FindStudentsUnderGrade------------------------------------------------------");
        si.testStudents(list,(Student st)->{return st.avgGrade < 8;});
        System.out.println("------------------------FindStudentsOverAge------------------------------------------------------");
        si.testStudents(list,(Student st)->{return st.age > 25;});
        System.out.println("------------------------FindStudentsUnderAge------------------------------------------------------");
        si.testStudents(list,(Student st)->{return st.age < 25;});
        System.out.println("------------------------FindStudentsBySex------------------------------------------------------");
        si.testStudents(list,(Student st)->{return st.sex != 'м';});
        System.out.println("------------------------FindStudentsMixCondition------------------------------------------------------");
        si.testStudents(list,(Student st)->{return (st.avgGrade >  8.8 && st.age < 20 && st.sex == 'ж');});
    }
}


