package Zaur_OOP.podpaket_lesson19;

public class Test3 {
    public static void main(String[] args) {
        String[] students = {"ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analyze", "filosofiya"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
