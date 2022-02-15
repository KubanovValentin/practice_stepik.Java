package Homework.homework_lesson16.variant_2;

public class UserByMail {
    String s = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
    String s1 = "yahoo";
    String s2 = "mail";
    String s3 = "gmail";

    void email(String s) {
        if (s.contains(s1) && s.contains(s2) && s.contains(s3)) {
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        }
    }

    public static void main(String[] args) {
        UserByMail userByMail = new UserByMail();
        userByMail.email(userByMail.s);
    }
}
