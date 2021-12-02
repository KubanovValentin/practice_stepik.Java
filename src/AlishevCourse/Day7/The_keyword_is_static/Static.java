package AlishevCourse.Day7.The_keyword_is_static;

public class Static {
    public static void main(String[] args) {

//        h1.setName("Tom");
//        Human.description="Nice";//это переменная класса и она будет делиться(общей) между объектами
//        Human.getDescription();


        Human h1=new Human("Bob",30);
        Human h2=new Human("Tom",40);
        h1.printNumberPeople();
        h2.printNumberPeople();
        Human h3=new Human("Rob",15);
        h1.printNumberPeople();
        h2.printNumberPeople();
        h3.printNumberPeople();
//        Human.description="Nice";
//        h1.getAllField();
//        h2.getAllField();
//
//        Human.description="Bad";
//        h1.getAllField();
//        h2.getAllField();

//        System.out.println(Math.pow(2,4));
//        System.out.println(Math.PI);

    }
}
class Human{
    //при создании объекта класса эти переменные создаются каждая отдельно и разная(для каждого объекта своя)
    private String name;
    private int age;

    private static int countPeople;
    //а static одна на всех(общая)и единственная. не меняется
//    public static String description;



    public Human(String name){
        this.name=name;

    }
    public Human(String name,int age){
        this.name=name;
        this.age=age;
        countPeople++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public static void getDescription(){
//        System.out.println(description);
//    }
    //метод который будет выводить все переменные на экран
//    public void getAllField(){
//        System.out.println(name+","+age+","+description);
//    }
//
//    public static void printAllFields(){
//        System.out.println(description);
//    }
    public void printNumberPeople(){
        System.out.println("Number of people is: "+countPeople);
    }
}