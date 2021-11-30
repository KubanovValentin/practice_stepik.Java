package AlishevCourse.Day5.The_keyword_is_This;

public class Test {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(18);
        human1.getInfo();

        Human human2 = new Human();
        human2.setName("Bob");
        human2.setAge(38);
        human2.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("Имя человека: " + name + ","+"возраст его: " + age+"лет.");
    }
}