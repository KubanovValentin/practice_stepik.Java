package Zaur_OOP.podpacet4;

public class Student {
    String name;
    int course;
    //   int count эта переменная считает студентов,
    // дефолтное состояние его 0,и добавлять студентов мы будем в конструкторе
    static int count;


    // создадим конструктор где эти две переменные будут
    public Student (String name2, int course2){
        count++;
        name=name2;
        course=course2;
        //при создании студента мы хотим чтобы выводилось надпись
        System.out.println("Student № "+count+" sozdan");
    }


    //допустим стоит задача добавить в этот класс новую переменную
    // которая всегда будет увеличиваться на 1 при создании нового студента
    // т.е данная переменная будет считать сколько студентов уже созданно

}
class StudentTest{
    public static void main(String[] args) {
        //создаем студентов
    Student st1=new Student("Vasek",1);
    Student st2=new Student("Petr",4);
    Student st3=new Student("Lena",2);

    System.out.println(Student.count);

    }
}