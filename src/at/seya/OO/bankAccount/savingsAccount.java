package at.seya.OO.bankAccount;

public class savingsAccount extends basicAccount{
    private int savingYears;
    private double rateOfInterrest;

    public savingsAccount(double balance, int savingYears, double rateOfInterrest) {
        super(balance);
        this.savingYears = savingYears;
        this.rateOfInterrest = rateOfInterrest;
    }

    public int getSavingYears() {
        return savingYears;
    }

    public double getRateOfInterrest() {
        return rateOfInterrest;
    }

    public void moneyGainer() {
        if (this.savingYears > 2) {
            this.setBalance(this.getBalance() + (this.getBalance() * this.savingYears));

        }
    }
}
