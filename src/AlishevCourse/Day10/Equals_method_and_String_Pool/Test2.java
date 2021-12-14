package AlishevCourse.Day10.Equals_method_and_String_Pool;

public class Test2 {
    public static void main(String[] args) {
        //сравнение строк
        String str1="Hello";//  str1      -->              {"Hello"}
        String str2="Hello";//  str2      -->                  ^

        System.out.println(str1.equals(str2));
    }
}
class Animal1 {
    private int id;

    public Animal1(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal1 otherAnimal1 = (Animal1) obj;
        return this.id == otherAnimal1.id;
    }
}