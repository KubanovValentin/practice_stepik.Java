package AlishevCourse.Day10.Wrapper_classes_of_primitive_data_types;

public class Test {
    public static void main(String[] args) {
        int x=1;
        System.out.println(x);
        Integer x2=new Integer(123);
        Integer.parseInt("123");
        //если нужен какой либо метод с примитивом-то нужно класс-обертка
        //автоупаковка ниже
        Integer x3=123;//Integer x3=new Integer(123);
        //автораспаковка
        Integer x4=123;
        int y=x4;//теперь y обычный примитив


    }
}
