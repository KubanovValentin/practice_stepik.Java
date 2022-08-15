package Zaur_OOP.podpaket_lesson29.lambda_expressions;

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

    void printStudentOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentOverAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentBySex(ArrayList<Student> aL, char sex) {
        for (Student s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> aL, double avgGrad, int age, char sex) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrad && s.age < age && s.sex == sex) {
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
        si.printStudentOverGrade(list, 8.5);
        System.out.println("------------------------------------------------------------------------------");
        si.printStudentUnderGrade(list, 7);
        System.out.println("------------------------------------------------------------------------------");
        si.printStudentOverAge(list, 25);
        System.out.println("------------------------------------------------------------------------------");
        si.printStudentUnderAge(list, 25);
        System.out.println("------------------------------------------------------------------------------");
        si.printStudentBySex(list, 'ж');
        System.out.println("------------------------------------------------------------------------------");
        si.printStudentMixCondition(list, 7, 20, 'ж');
        System.out.println("------------------------------------------------------------------------------");
    }
}