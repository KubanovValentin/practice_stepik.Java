package JavaRushTaskSt.Zadachi_14.LV.Multiple_choice_operator_switch;
/*
В классе Solution есть метод getMonthByIndex(int), который возвращает название месяца по его номеру, начиная с 1.
Твоя задача — переписать метод, используя только оператор switch и ключевые слова case, break.

Требования:
•	Метод getMonthByIndex(int) должен возвращать имя месяца по его номеру.
•	В методе getMonthByIndex(int) должен использоваться только оператор множественного выбора switch.
* */
public class Solution {
    /*
    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        if (monthIndex == 1) {
            monthString = "Январь";
        } else if (monthIndex == 2) {
            monthString = "Февраль";
        } else if (monthIndex == 3) {
            monthString = "Март";
        } else if (monthIndex == 4) {
            monthString = "Апрель";
        } else if (monthIndex == 5) {
            monthString = "Май";
        } else if (monthIndex == 6) {
            monthString = "Июнь";
        } else if (monthIndex == 7) {
            monthString = "Июль";
        } else if (monthIndex == 8) {
            monthString = "Август";
        } else if (monthIndex == 9) {
            monthString = "Сентябрь";
        } else if (monthIndex == 10) {
            monthString = "Октябрь";
        } else if (monthIndex == 11) {
            monthString = "Ноябрь";
        } else if (monthIndex == 12) {
            monthString = "Декабрь";
        } else {
            monthString = "Недействительный месяц";
        }
        return monthString;
    }
    */
    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int month) {
        String monthString;
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default:
                monthString = "Недействительный месяц";
                break;
        }
        return monthString;
    }
}
