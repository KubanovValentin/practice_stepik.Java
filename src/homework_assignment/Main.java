package homework_assignment;

//Создать класс Dog(собака), в котором будет 3 поля: String кличка, String порода, int скорость.
// Создать внутри класса два метода:
//метод run(бежать)- без параметров, тип void. При вызове данного метода на экран выводиться строка
// "бегу, бегу, бегу...." слово "бегу" должно вывестись столько раз, сколько указанно в переменной скорость.
//Второй метод String info();- возвращает строку с полной информацией о собаке(кличка, порода и скорость),
// этот метод ничего не выводит на экран.


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.nickname="Джерри";
        dog.breed="немецкая овчарка";
        dog.speed =15;

        dog.run();
        System.out.println(dog.info());

        }
    }

