public class PlatinumCreditCard extends CreditCard {
    private double travelPoints;

    public PlatinumCreditCard(double balance, double creditLimit, double travelPoints) {
        super(balance, creditLimit);
        this.travelPoints = travelPoints;
    }

    public double getTravelPoints() {
        return travelPoints;
    }

    public void setTravelPoints(double travelPoints) {
        this.travelPoints = travelPoints;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public boolean pay(double amount) {
        // Реализация оплаты с учетом бонусных баллов и кредитного лимита
        return super.pay(amount);
    }

    public double getAvailableFunds() {
        return getBalance() + getCreditLimit();
    }

    public void withdraw(double amount) {
        if (amount <= getBalance() + getCreditLimit()) {
            setCreditLimit(getBalance() - amount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}