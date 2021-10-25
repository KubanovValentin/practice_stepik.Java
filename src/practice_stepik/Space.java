package practice_stepik;
import java.util.Scanner;


public class Space {
    public static void main(String[] args) {
//        int[]dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
//        for (int i:dayOfMonth){
//            System.out.print(i+" ");
//        }
//        String name = "Ivan";
//        int age = 33;
//        String result = "Привет, \"" + name + "\"! \nТебе " + age + " года.";
//        System.out.println(result);
//----------------------------------------------------------
// создать строковый массив с названием месяцев,проинициализировать сразу.
// После этого вывести все назавания в одну строчку и через запятую,
// а после последнего слова должна стоять точка.
//        String[] listOfMonth = {
//                "январь",
//                "февраль",
//                "март",
//                "апрель",
//                "май",
//                "июнь",
//                "июль",
//                "август",
//                "сентябрь",
//                "октябрь",
//                "ноябрь",
//                "декабрь"
//        };
//        String result = "";
//        for (int i =0;i < listOfMonth.length;i++){
//            result+=listOfMonth[i];
//            if (i==listOfMonth.length-1){
//                result+=".";
//            }else {
//                result+=", ";
//            }
//        }
//        System.out.println(result);

//------------------------------------------------------------
// написать программу, которая принимает номер месяца и выводит его название на экран,
// если такого месяца нет, то вывести надпись "месяц не существует"


//        Scanner sc = new Scanner(System.in);
//        int mounth = sc.nextInt();
//        switch (mounth) {
//            case 1:
//                System.out.println("Январь");
//                break;
//            case 2:
//                System.out.println("Февраль");
//                break;
//            case 3:
//                System.out.println("Март");
//                break;
//            case 4:
//                System.out.println("Апрель");
//                break;
//            case 5:
//                System.out.println("Май");
//                break;
//            case 6:
//                System.out.println("Июнь");
//                break;
//            case 7:
//                System.out.println("Июль");
//                break;
//            case 8:
//                System.out.println("Август");
//                break;
//            case 9:
//                System.out.println("Сентябрь");
//                break;
//            case 10:
//                System.out.println("Октябрь");
//                break;
//            case 11:
//                System.out.println("Ноябрь");
//                break;
//            case 12:
//                System.out.println("Декабрь");
//                break;
//            default:
//                System.out.println("месяц не существует");
//        }
//--------------
// можно и так
//        int numberOfMonth=13;
//        if(numberOfMonth==1){
//            System.out.println("Январь");
//        }else if (numberOfMonth==2){
//            System.out.println("Февраль");
//        }else if (numberOfMonth==3){
//            System.out.println("Март");
//        }else if (numberOfMonth==4){
//            System.out.println("Апрель");
//        }else if (numberOfMonth==5){
//            System.out.println("Май");
//        }else if (numberOfMonth==6){
//            System.out.println("Июнь");
//        }else if (numberOfMonth==7){
//            System.out.println("Июль");
//        }else if (numberOfMonth==8){
//            System.out.println("Август");
//        }else if (numberOfMonth==9){
//            System.out.println("Сентябрь");
//        }else if (numberOfMonth==10){
//            System.out.println("Октябрь");
//        }else if (numberOfMonth==11){
//            System.out.println("Ноябрь");
//        }else if (numberOfMonth==12){
//            System.out.println("Декабрь");
//        }else {
//            System.out.println("месяц не существует");
//        }

//------------------------------------------дз
// написать программу которая принимает строковую переменную с названием месяца.
// и если месяц введен правильно то вывести на экран время года к которому этот месяц относиться
// в противном случае вывести сообщение что месяц не существует.

//        Scanner sc = new Scanner(System.in);
//        String timeOfTheYear = sc.nextLine();
//        switch (timeOfTheYear) {
//            case "Декабрь":
//                System.out.println("зима начало");
//                break;
//            case "Январь":
//                System.out.println("зима середина");
//                break;
//            case "Февраль":
//                System.out.println("зима конец");
//                break;
//            case "Март":
//                System.out.println("весна начало");
//                break;
//            case "Апрель":
//                System.out.println("весна середина");
//                break;
//            case "Май":
//                System.out.println("весна конец");
//                break;
//            case "Июнь":
//                System.out.println("лето начало");
//                break;
//            case "Июль":
//                System.out.println("лето середина");
//                break;
//            case "Август":
//                System.out.println("лето конец");
//                break;
//            case "Сентябрь":
//                System.out.println("осень начало");
//                break;
//            case "Октябрь":
//                System.out.println("осень середина");
//                break;
//            case "Ноябрь":
//                System.out.println("осень конец");
//                break;
//            default:
//                System.out.println("месяц не существует, введите месяц с заглавной буквы");
//        }
    }
}
