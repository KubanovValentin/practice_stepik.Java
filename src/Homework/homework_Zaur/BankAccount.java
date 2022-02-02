package Homework.homework_Zaur;
//в класс BankAccount добавьте 2 метода. первый метод называеться popolnenieScheta
// и увеличивает баланс на сумму,которая указана в параметре этого метода.
// второй метод называеться snyatieSoScheta и уменьшает баланс на сумму,которая указана в параметре этого метода.
public class BankAccount {
    //три переменные
    int id=10;
    String name="Вася";
    double balance=100;


    // 2 метода

    void popolnenieScheta (double plus){
        //для читабельности и красоты вывода пишем много строк
        //тело метода
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополнился на: " + plus);
        balance+=plus;
        System.out.println("Баланс после пополнения: " + balance);
        System.out.println();

    }
    void snyatieSoScheta(double minus){
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс уменьшился на: " + minus);
        balance-=minus;
        System.out.println("Баланс после уменьшения: " + balance);
        System.out.println();
    }

}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount bA=new BankAccount();
       bA.popolnenieScheta(48.89);
       bA.snyatieSoScheta(23.76);
    }
}

