package AlishevCourse.Day1.Variables_Primitive_data_types;

public class Variables {
    public static void main(String[] args) {
        //сначала декларируем потом инициализируем
        int myInt;//декларация-выделили свободное место в памяти для нее, но она пуста еще-без значения
        myInt=557;//произошло инициализация
        System.out.println(myInt);
        //сейчас задекларируем и сразу проинициализируем
        int myInt1=124;
        short myShort=31000;
        long myLong=2323423423423L;

        double myDouble=3423423.4234;//дефолт
        float myFloat=231312.13231f;

        char c='q';
        boolean b=true;
        byte myByte=100;//-128 до 127
    }
}
