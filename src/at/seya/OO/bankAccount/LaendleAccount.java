package at.seya.OO.bankAccount;

public class LaendleAccount extends BasicAccount {
    private double membershipYears;
    private double accountKeeping = 83.04;

    public LaendleAccount(double balance, double membershipYears) {
        super(balance);
        this.membershipYears = membershipYears;
    }

    public double getMembershipYears() {
        return membershipYears;
    }

    public double getAccountKeeping() {
        return accountKeeping;
    }

    public void accountKeepingCosts() {
        for (int i = 0; i < this.getMembershipYears(); i++) {
            setBalance(this.getBalance() - this.getAccountKeeping());
        }
        double accountKeepingCosts = membershipYears * accountKeeping;
        System.out.println("Die bisherigen Kontoführungskostenkosten betragen: " + accountKeepingCosts + "€");
    }
}
