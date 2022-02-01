package JavaRushTaskSt.Zadachi_13.LV.Wrapper_Types;

public class Boolean {
    //Константы: TRUE и FALSE
    public static final Boolean TRUE = new Boolean(true);
    public static final Boolean FALSE = new Boolean(false);
    //Переменная-значение
    private final boolean value;
    //Конструктор класса Boolean
    public Boolean(boolean value)
    {
        this.value = value;
    }
    //Метод возвращает значение внутренней переменной-значения
    public boolean booleanValue()
    {
        return value;
    }
    //Этот статический метод умеет преобразовывать true в TRUE и false в FALSE.
    public static Boolean valueOf(boolean value)
    {
        return (value ? TRUE : FALSE);
    }
}
