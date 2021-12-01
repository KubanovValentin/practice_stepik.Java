package AlishevCourse.Day6.Zadachi;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    Teacher teacher=new Teacher("Иванов Иван Иванович","география");
    Student student=new Student("Петров Петя Петрович");
    teacher.evaluate(student);
    }
}

class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;//от 2 до 5

        String evaluation = "";
        switch (randomValue) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
//"Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
        System.out.println("Преподаватель " + this.fio +
                " оценил студента с именем " + student.getFio() +
                " по предмету " + this.subject +
                " на оценку " + evaluation);
    }
}

class Student {
    private String fio;

    public Student(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}