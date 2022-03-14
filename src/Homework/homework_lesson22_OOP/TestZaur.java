package Homework.homework_lesson22_OOP;

public class TestZaur {
}

class StudentZaur {
    private StringBuilder name;
    private int course;
    private int grade;

    //name
    public StringBuilder getName() {
        StringBuilder sbn = new StringBuilder(name);
        return sbn;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }

    }

    //course
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }
    //grade

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    // showInfo()
    public void showInfo() {
        System.out.println("Имя: " + getName() + " курс: " + getCourse() + " оценка: " + getGrade());
    }
}

class StudentZaurTest {
    public static void main(String[] args) {
        StudentZaur stZ = new StudentZaur();
        StringBuilder sbZ = new StringBuilder("Вася");
        stZ.setName(sbZ);
        stZ.setCourse(2);
        stZ.setGrade(7);
        stZ.showInfo();
    }
}