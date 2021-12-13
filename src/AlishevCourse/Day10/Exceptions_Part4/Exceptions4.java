package AlishevCourse.Day10.Exceptions_Part4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        }  catch (Exception e){//если ловим класс родителя то дальше ловить исключения не имеет смысла

        }



//        } catch (IOException  | ParseException e) {
//            e.printStackTrace();
//        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
