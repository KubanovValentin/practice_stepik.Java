package AlishevCourse.Day9.Zadachi.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student=new Student("Valentin","13");
        Teacher teacher=new Teacher("Bob","Java Mentor");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}

