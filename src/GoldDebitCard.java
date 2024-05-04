public class GoldDebitCard extends DebitCard {
    private double bonusPoints;

    public GoldDebitCard(double balance, double bonusPoints) {
        super(balance);
        this.bonusPoints = bonusPoints;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(double bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public boolean pay(double amount) {
        return super.pay(amount);
    }


    public double getAvailableFunds() {
        return getBalance() + bonusPoints;
    }
}