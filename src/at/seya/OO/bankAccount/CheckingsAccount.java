package at.seya.OO.bankAccount;

public class CheckingsAccount extends BasicAccount {
    private double membershipYears;
    private double rateOfInterest;

    public CheckingsAccount(double balance, double membershipYears, double rateOfInterest) {
        super(balance);
        this.membershipYears = membershipYears;
        this.rateOfInterest = rateOfInterest;
    }

    public double getMembershipYears() {
        return membershipYears;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void accountInterest() {
        double accountInterest = (this.getBalance() * this.getRateOfInterest()) * this.getMembershipYears();
        System.out.println("Die erhaltenen Kontokosten betragen: " + accountInterest + "€");
        this.setBalance(this.getBalance() - accountInterest);
    }
}
