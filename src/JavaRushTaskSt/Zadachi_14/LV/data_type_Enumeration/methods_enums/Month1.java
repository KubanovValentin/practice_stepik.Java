package JavaRushTaskSt.Zadachi_14.LV.data_type_Enumeration.methods_enums;
/*
В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(),
getAutumnMonths() которые будут возвращать массив с тремя месяцами.

Требования:
•	Публичный статический метод getWinterMonths() должен возвращать массив с зимними месяцами.
•	Публичный статический метод getSpringMonths() должен возвращать массив с весенними месяцами.
•	Публичный статический метод getSummerMonths() должен возвращать массив с летними месяцами.
•	Публичный статический метод getAutumnMonths() должен возвращать массив с осенними месяцами.
* */
public enum Month1 {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    public static Month1[] getWinterMonths() {
        return new Month1[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month1[] getSpringMonths() {
        return new Month1[]{MARCH, APRIL, MAY};
    }

    public static Month1[] getSummerMonths() {
        return new Month1[]{JUNE, JULY, AUGUST};
    }

    public static Month1[] getAutumnMonths() {
        return new Month1[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }
}
