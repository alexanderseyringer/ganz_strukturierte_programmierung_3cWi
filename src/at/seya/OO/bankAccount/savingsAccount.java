package at.seya.OO.bankAccount;

public class SavingsAccount extends BasicAccount {
    private double savingYears;
    private double rateOfInterest;

    public SavingsAccount(double balance, double savingYears, double rateOfInterrest) {
        super(balance);
        this.savingYears = savingYears;
        this.rateOfInterest = rateOfInterrest;
    }

    public double getSavingYears() {
        return savingYears;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void accountInterest() {
        double accountInterest = (this.getBalance() * this.getRateOfInterest()) * this.getSavingYears();
        System.out.println("Die erhaltenen Zinsen betragen: " + accountInterest + "€");
        this.setBalance(this.getBalance() + accountInterest);
    }
}
