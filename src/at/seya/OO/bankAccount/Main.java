package at.seya.OO.bankAccount;

public class Main {
    public static void main(String[] args) {
        basicAccount acc1 = new basicAccount(250);
        acc1.showBalance();
        acc1.deposit(5);
        acc1.withdraw(10);

    }
}
