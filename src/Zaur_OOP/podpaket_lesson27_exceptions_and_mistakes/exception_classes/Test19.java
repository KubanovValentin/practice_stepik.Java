package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

public class Test19 {
    void marafon(int temperaturaVozduxa, int tempBega) throws PodvernutNoguExeption {
        if (tempBega > 12) {
            throw new PodvernutNoguExeption("temp bega slishkom visokii: " + tempBega);
        }
        if (temperaturaVozduxa > 32) {
            throw new SveloMishzoyExption();
        }
        System.out.println("probezali marafon");
    }

    public static void main(String[] args) {
        Test19 t19 = new Test19();
        try {
            t19.marafon(20, 11);
        } catch (PodvernutNoguExeption e) {
            System.out.println(e.getMessage());
        }
//        catch (SveloMishzoyExption e){
//            System.out.println(e.getMessage());
//        }
        finally {
            System.out.println("vi poluchaete gramotu");
        }
    }
}

class PodvernutNoguExeption extends Exception {
    PodvernutNoguExeption(String message) {
        super(message);
    }

    PodvernutNoguExeption() {

    }
}

class SveloMishzoyExption extends RuntimeException {
    SveloMishzoyExption(String message) {
        super(message);
    }

    SveloMishzoyExption() {

    }
}