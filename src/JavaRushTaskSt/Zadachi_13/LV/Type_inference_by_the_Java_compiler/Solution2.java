package JavaRushTaskSt.Zadachi_13.LV.Type_inference_by_the_Java_compiler;
/*
В классе Solution есть поле intArray, геттер и сеттер для него, и метод main с объявленными в нем переменными.
Тебе нужно заменить типы переменных с var на конкретный тип объекта (изменять названия и инициализацию объектов нельзя),
 а также починить геттер и сеттер поля intArray.

Пример:
var console = new Scanner(System.in);
Заменить на:
Scanner console = new Scanner(System.in);

Требования:
•	Замени типы переменных c var на конкретный тип объекта.
•	Почини геттер и сеттер для поля intArray.
 */
public class Solution2 {
//    private var intArray = new int[4];
//
//    public var getIntArray() {
//        return intArray;
//    }
//
//    public void setIntArray(var intArray) {
//        this.intArray = intArray;
//    }
//
//    public static void main(String[] args) {
//        var solution = new Solution();
//        var string = new String("Hello");
//        var stringBuilder = new StringBuilder();
//    }
private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
