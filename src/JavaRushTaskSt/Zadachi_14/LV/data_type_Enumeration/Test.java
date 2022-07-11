package JavaRushTaskSt.Zadachi_14.LV.data_type_Enumeration;

public class Test {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Day myLoveDay = Day.FRIDAY;
        System.out.println("мой любимый день недели это - " + myLoveDay);

        //Тип enum имеет несколько встроенных методов, два из них очень интересные:
        //Статический метод values() возвращает массив всех значений типа enum:
        Day[] days = Day.values();
        for (Day day : days)
            System.out.println(day);

        System.out.println(days[2]);

        //Метод ordinal() возвращает порядковый номер константы. Вызывать его нужно не у класса enum, а у значения enum:
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.FRIDAY.ordinal());
        System.out.println(Day.SUNDAY.ordinal());
    }
}
