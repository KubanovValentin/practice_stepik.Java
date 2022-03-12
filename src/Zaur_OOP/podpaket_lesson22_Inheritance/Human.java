package Zaur_OOP.podpaket_lesson22_Inheritance;

public class Human {
//    public Human(String n) {
//        this.name = n;
//    }

    public String name="Kolek";
    private String fName="Petuxov";

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public static int salary=150;
    public void work(){
        System.out.println("rabotat");
    }
    public static void rest(){
        System.out.println("otdixat");
    }
    void def(){
        System.out.println("defolt acces modef");
    }
    protected void protect(){
        System.out.println("protect acces modef");
    }
}
class Student extends Human{
    public static void main(String[] args) {
        Student s=new Student();

        System.out.println(s.name);
        System.out.println(s.getfName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
        System.out.println("заменим фамилию Petuxov на Dundik");
        s.setfName("Dundik");
        System.out.println(s.getfName());
        s.def();
        s.protect();
    }
}