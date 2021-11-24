package AlishevCourse.Day1.Strings_in_Java_Reference_data_types;

public class Strings {
    public static void main(String[] args) {
        int a=5;
        //string (тип) является классом
        //примитивные типы хранят значение .а стринг ссылается на объект
        String str="Hello";
        String str1="world";
        String space=" ";
        System.out.println(str+space+str1);
        System.out.println("Hello"+ " "+"Bob");
        System.out.println("My number is "+ a);
    }
}
