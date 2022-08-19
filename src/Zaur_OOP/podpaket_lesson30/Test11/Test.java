package Zaur_OOP.podpaket_lesson30.Test11;
//StackOverflowError
public class Test {
}
class Book{
    String bookName;
    Book(){
        Book b1=new Book();
        b1.bookName="Java OCA";
    }
}
class TestBook{
    public static void main(String[] args) {
        Book b2=new Book();
        b2.bookName="Java OCA";
        System.out.println(b2.bookName);
    }
}