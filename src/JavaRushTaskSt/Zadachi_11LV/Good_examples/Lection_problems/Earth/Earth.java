package JavaRushTaskSt.Zadachi_11LV.Good_examples.Lection_problems.Earth;
/*
Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс.
В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.
 */
public class Earth {

    public static void main(String[] args) {
        Africa africa=new Africa( 30_250_000);
        Eurasia eurasia=new Eurasia(53_890_000);
        Antarctica antarctica=new Antarctica(13_660_000);
        NorthAmerica northAmerica=new NorthAmerica(20_400_000);
        SouthAmerica southAmerica=new SouthAmerica(17_820_000);
        Australia australia=new Australia(7_690_000 );
    }
}
