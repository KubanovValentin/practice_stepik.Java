package Zaur_OOP.podpaket_lesson30.Test13;
//ClassCastException
public class Test {
}
class Book{

}
interface Readable{

}
class PaperBook extends Book implements Readable{

}
class ElectronicBook extends Book{

}
class TestBook{
    public static void main(String[] args) {
        Readable r= null;
        ElectronicBook eBook=new ElectronicBook();
        r=(Readable) eBook;//нет is the (связм между ElectronicBook и Readable)
    }
}