package homework_Zaur;
//в класс BankAccount добавьте 2 метода. первый метод называеться popolnenieScheta
// и увеличивает баланс на сумму,которая указана в параметре этого метода.
// второй метод называеться snyatieSoScheta и уменьшает баланс на сумму,которая указана в параметре этого метода.
public class BankAccount {
    double balance;


    double popolnenieScheta (double plus){
        balance+=plus;
        return balance;
    }
    double snyatieSoScheta(double minus){
        balance-=minus;
        return balance;
    }
    void showInfo(){
        System.out.println("ваш счет изменился и сумма на нем: "+ balance);

    }
}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount bA=new BankAccount();
        bA.balance=124.23;
        bA.popolnenieScheta(145.34);
        bA.showInfo();
        bA.snyatieSoScheta(104.45);
        bA.showInfo();
    }
}

