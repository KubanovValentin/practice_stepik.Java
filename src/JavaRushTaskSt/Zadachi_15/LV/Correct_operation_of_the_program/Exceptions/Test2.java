package JavaRushTaskSt.Zadachi_15.LV.Correct_operation_of_the_program.Exceptions;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Адронный Коллайдер запущен");

        try {
            launchTheSquadronCollider(1);//запуститьАдронныйКоллайдер
            launchTheSquadronCollider(0);//запуститьАдронныйКоллайдер
        } catch (Exception e) {
            System.out.println("Ошибка! Перехвачено исключение");
            System.out.println("Планету засосало в черную дыру!");
        }

        System.out.println("Адронный Коллайдер остановлен");
    }

    public static void launchTheSquadronCollider(int n){//запуститьАдронныйКоллайдер
        System.out.println("Все отлично работает: " + n);
        System.out.println(2 / n);
        System.out.println("Никаких проблем нет: " + n);
    }
}
