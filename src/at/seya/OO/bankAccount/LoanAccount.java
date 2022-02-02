package at.seya.OO.bankAccount;

public class LoanAccount extends BasicAccount{
    private double loanInterest = 0.023;
    private double creditLimit = -7000;
    private double loanMonths;

    public LoanAccount(double balance, double loanMonths) {
        super(balance);
        this.loanMonths = loanMonths;
    }

    public double getLoanInterest() {
        return loanInterest;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getLoanMonths() {
        return loanMonths;
    }

    public void creditCosts() {
        double creditCosts;
        if(this.getBalance() < 0) {
            creditCosts = (this.getBalance() * loanInterest) * loanMonths;
            this.setBalance(this.getBalance() + creditCosts);
            System.out.println("Du bist im Minus, folglich hast du " + creditCosts + "€ an Kreditzinsen bezahlt!");
        }
        else {
            System.out.println("Du bist nicht Minus! Bravo!");
        }
    }

    @Override
    public void withdraw(double withdrawValue) {
        if(this.getBalance() <= creditLimit) {
            System.out.println("Du kannst nichts von deinem Konto abheben, da dein Kontostand unter dem Kreditrahmen liegt");
        }

        else if((this.getBalance() - withdrawValue) < creditLimit) {
            System.out.println("Du kannst nichts abheben, da dein Kontostand das Kreditlimit übersteigen würde!");
        }

        else {
            this.setBalance(this.getBalance() - withdrawValue);
            System.out.println("Betrag wurde erfolgreich ausbezahlt!");
            System.out.println("Der neue Kontostand beträgt nun: " + this.getBalance() + "€");
        }
    }
}
