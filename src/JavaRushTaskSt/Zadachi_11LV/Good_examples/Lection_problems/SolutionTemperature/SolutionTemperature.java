package JavaRushTaskSt.Zadachi_11LV.Good_examples.Lection_problems.SolutionTemperature;
/*
У класса City есть два поля - название города и текущая температура воздуха.
Также в классе Solution есть метод showWeather: он выводит в консоли информацию о погоде в городе,
который передан в качестве аргумента метода. Реализуй метод showWeather,
который должен выводить в консоли информацию в таком формате:
В городе "название города" сегодня температура воздуха "температура в городе"
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

В городе Дубай сегодня температура воздуха 40
 */
public class SolutionTemperature {
    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName()+" сегодня температура воздуха "+ city.getTemperature());
    }

    public static void main(String[] args) {
        City city=new City("Дубай",40);
        showWeather(city);
        City city1=new City("Барановичи",-3);
        showWeather(city1);
    }
}
