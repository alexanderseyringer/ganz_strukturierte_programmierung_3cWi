package at.seya.OO.bankAccount;

public class Main {
    public static void main(String[] args) {
        BasicAccount acc1 = new BasicAccount(250);
        acc1.showBalance();
        acc1.deposit(5);
        acc1.withdraw(10);

        SavingsAccount acc2 = new SavingsAccount(50, 5, 0.00125);
        acc2.accountInterest();
        acc2.showBalance();

        CheckingsAccount acc3 = new CheckingsAccount(120, 3, 0.01);
        acc3.accountInterest();
        acc3.showBalance();

        LaendleAccount acc4 = new LaendleAccount(320, 4);
        acc4.accountKeepingCosts();
        acc4.showBalance();

        LoanAccount acc5 = new LoanAccount(2, 3);
        acc5.withdraw(5500);
        acc5.creditCosts();
        acc5.showBalance();
    }
}
