public class CreditCard extends BankCard {
    double creditLimit;

    public CreditCard(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            if (balance < 0) {
                // Погашение кредитной части
                double payment = Math.min(amount, -balance);
                balance += payment;
                amount -= payment;
            }
            if (amount > 0) {
                // Пополнение собственных средств
                balance += amount;
            }
        }
    }

    @Override
    public boolean pay(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            } else {
                // Если собственных средств недостаточно, списываем с кредитной части
                if (balance + creditLimit >= amount) {
                    double shortage = amount - balance;
                    balance = 0;
                    creditLimit -= shortage;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public double getBalance() {
        return balance + Math.max(0, -balance); // Учитываем кредитную часть
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getTotalFunds() {
        return balance + creditLimit; // Общие средства (собственные + кредитные)
    }
}