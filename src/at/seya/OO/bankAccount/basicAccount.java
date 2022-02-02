package at.seya.OO.bankAccount;

public class BasicAccount {
    private double balance;

    public BasicAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Der aktuelle Kontostand beträgt: " + this.balance + "€");
    }

    public void deposit(double depositValue) {
        this.balance = this.balance + depositValue;
        System.out.println("Betrag wurde erfolgreich eingezahlt!");
        System.out.println("Der neue Kontostand beträgt nun: " + this.balance + "€");
    }

    public void withdraw(double withdrawValue) {
        this.balance = this.balance - withdrawValue;
        System.out.println("Betrag wurde erfolgreich ausbezahlt!");
        System.out.println("Der neue Kontostand beträgt nun: " + this.balance + "€");
    }
}
