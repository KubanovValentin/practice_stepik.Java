package AlishevCourse.Day10.Exceptions_Part2_Throwing_exceptions.Exceptions1;


//создан для того чтобы индифицировать в ходе работы с классом сканер
public class ScannerException extends Exception {
    public ScannerException(String description){
        super(description);
    }


}
