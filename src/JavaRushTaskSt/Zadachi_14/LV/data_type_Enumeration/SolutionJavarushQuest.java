package JavaRushTaskSt.Zadachi_14.LV.data_type_Enumeration;
/*
В enum JavarushQuest хранится список квестов.
Твоя задача — получить массив всех элементов в методе main (используй метод values()) и
вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.

Требования:
•	В методе main получи список всех констант из enum JavarushQuest с помощью метода values().
•	В методе main выведи порядковый номер каждого элемента с новой строки, используя метод ordinal().
* */
public class SolutionJavarushQuest {
    public static void main(String[] args) {
        JavarushQuest[] values = JavarushQuest.values();
        for (JavarushQuest value : values) {
            System.out.println(value.ordinal());
        }
    }
}
