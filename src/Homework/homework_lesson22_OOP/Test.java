package Homework.homework_lesson22_OOP;


//tz1
public class Test {
    /*
    создайте класс Student со следующими переменами: name(используйте StringBuilder), course, grade.
    Примените инкапсуляцию к данному классу.Длина имени объектов не должна быть менее 3-х символов, оценки должны быть числами,
    в интервале от 1 до 10,курс должен быть числом от 1 до 4 включительно. Создайте метод showInfo,который будет выводить всю
    информацию о студенте,не используя переменные класса напрямую.Создайте класс TestStudent, котором создайте объект класса
    Student,придайте его переменным значения.Произведите вызов метода showInfo.

     */
}

class Student {
    //имя
    private StringBuilder name;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder n) {
        StringBuilder sb = new StringBuilder(n);
        this.name = sb;
    }

    //    курс
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4) {
            this.course = course;
        }
    }

    //оценка
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        }

    }
    public void showInfo(){
        System.out.println("Имя студента: "+name);
        System.out.println("курс студента: "+course);
        System.out.println("оценка студента: "+grade);
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student student=new Student();
        student.setName(new StringBuilder("Valentin"));
        student.setCourse(3);
        student.setGrade(8);
        student.showInfo();
    }



}