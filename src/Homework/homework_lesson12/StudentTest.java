package Homework.homework_lesson12;

import Zaur_OOP.podpaket_lesson11.Student;

public class StudentTest {
    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("студенты равны");
        } else {
            System.out.println("студенты не равны");
        }
    }
    public static void method2(Student st1, Student st2){
        if (st1.name.equals(st2.name)){
            if (st1.course== st2.course){
                if (st1.grade== st2.grade){
                    System.out.println("имена,курсы,оценки студентов одинаковые");
                }else {
                    System.out.println("имена,курсы студентов одинаковые но оценки отличаются");
                }
            }else {
                System.out.println("имена студентов одинаковые но курсы отличаются");
            }
        }else {
            System.out.println("имена студентов отличаются");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 3, 9.5);
        Student s2 = new Student("Pert", 1, 5.3);
        method1(s1,s2);
        method2(s1,s2);

    }
}
