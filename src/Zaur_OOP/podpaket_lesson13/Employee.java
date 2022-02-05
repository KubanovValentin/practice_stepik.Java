package Zaur_OOP.podpaket_lesson13;

public class Employee {
    public static void main(String[] args) {
        /*
        что бы не повторять каждый день  System.out.println("рабочий день до 18:00") сделать надо ниже
         */
        switch ("понедельник"){
            case "понедельник":
            case "вторник" :
            case "среда":
            case "четверг":
            case "пятница":
                System.out.println("рабочий день до 18:00");
                break;
            case "суббота":
                System.out.println("рабочий день до 14:00");
                break;
            case "воскресенье":
                System.out.println("выходной");
                break;
            default:
                System.out.println("такого дня нет");
        }
    }
}
