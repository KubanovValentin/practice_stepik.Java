package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.homework;

public class Test {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            }catch (NeVodExeption e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Tiger {
    public void eat(String eda) {
        if (!eda.equals("myaso")) {
            throw new NeMyasoExeption("Tiger ne eat " + eda);
        }
        System.out.println("Tiger eat myaso");
    }

    public void drink(String jidkost) throws NeVodExeption {
        if (!jidkost.equals("voda")) {
            throw new NeVodExeption("Tiger ne pyet " + jidkost);
        }
        System.out.println("Tiger pyet vodu");
    }
}
class NeMyasoExeption extends RuntimeException{
    NeMyasoExeption(String s){
        super(s);
    }
}
class NeVodExeption extends Exception{
    NeVodExeption(String s){
        super(s);
    }
}