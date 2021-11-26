package AlishevCourse.Day3.The_switch_statement;

import java.util.Scanner;

public class Swith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Введите возраст");
//        //принимает числовое значение
//        int age= sc.nextInt();
//        switch (age){
//            case 0:
//                System.out.println("ты родился");
//                break;
//            case 7:
//                System.out.println("ты пошел в школу");
//                break;
//            case 18:
//                System.out.println("ты закончил школу");
//                break;
//            default:
//                System.out.println("не одно из педыдущих условий не подошло");
//            break;
//        }
        //принимает строку

        System.out.println("введите город в котором живешь");
        String town= sc.nextLine();
        switch (town){
            case "Минск":
                System.out.println("столица нашего государства!!!");
                break;
            case "Барановичи":
                System.out.println("один из железно-дорожных направлений государства");
                break;
            case "Брест":
                System.out.println("город герой");
                break;
        }
    }
}
