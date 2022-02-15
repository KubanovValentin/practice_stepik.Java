package Homework.homework_lesson16.variant_1;

public class UserByMail2 {

    public void email(String s){
        int a=0;//позиция символа @
        int b=0;//позиция символа .
        int c=0;//позиция символа ;

        while (c<s.length()-1){
            a=s.indexOf('@',c);
            b=s.indexOf('.',c);
            c=s.indexOf(';',c+1);
            System.out.println(s.substring(a+1,b));
        }

    }
}
class UserByMailTest2{
    public static void main(String[] args) {
        UserByMail2 userByMail2=new UserByMail2();
        userByMail2.email("ya@yahoo.com; on@mail.ru; ona@gmail.com; ono@google.by;");
    }
}
