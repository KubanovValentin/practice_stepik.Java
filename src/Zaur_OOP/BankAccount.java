package Zaur_OOP;

public class BankAccount {

    //instance variable- переменные экземпляра(объекта)
    int id;
    String name;
    double balance;

}

class BankAccountTest {
    public static void main(String[] args) {

        //создаем объекты
        //адрес объектов это (MyAccount, YourAccount, HisAccount)
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        //сейчас присвоим значения для объектов
        MyAccount.id = 1;
        MyAccount.name = "Valentin";
        MyAccount.balance = 120.34;

        System.out.println(MyAccount.name);

        YourAccount.id = 2;
        YourAccount.name = "Ivan";
        YourAccount.balance = 20.0;


        HisAccount.id = 3;
        HisAccount.name = "Petr";
        HisAccount.balance = 0.99;


    }
}