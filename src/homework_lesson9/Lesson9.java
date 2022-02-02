package homework_lesson9;

public class Lesson9 {
    public static void abc(){
        String s1=new String("ABC");
        String s2=new String("DEF");
    }

    public static void main(String[] args) {
        Lesson9 lesson9=new Lesson9();// жив
        abc(); //не жив
        //как этот метод прекращает свое действие так и созданные обьекты прекращают свое существование
        // т.к они находятся внутри этого метода
        abc(); //не жив
        String s1=new String("ABC");// жив
        abc();//не жив
    }
}
