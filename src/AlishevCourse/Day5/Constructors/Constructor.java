package AlishevCourse.Day5.Constructors;

public class Constructor {
    public static void main(String[] args) {
        Human human1=new Human();
        Human human2=new Human("Bob");
        Human human3=new Human("Jeck",36);
//        human1.setName("Bob");
//        human1.setAge(40);

    }
}
class Human{

    private String name;
    private int age;

    public Human(){
        this.name="имя по умолчанию";
        this.age=0;
    }
    public Human(String name){
        this.name=name;
        System.out.println("привет из второго конструктора!");
    }
    public Human(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("привет из третьего конструктора!");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
}