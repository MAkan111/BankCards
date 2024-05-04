import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Создание дебетовой карты
        GoldDebitCard goldDebitCard = new GoldDebitCard(10000.0, 500.0);
        System.out.println("Золотая дебетовая карта:");
        System.out.println("Баланс: " + goldDebitCard.getBalance());
        System.out.println("Доступные средства на золотой дебетовой карте: " + goldDebitCard.getAvailableFunds());

        // Создание кредитной карты
        PlatinumCreditCard platinumCreditCard = new PlatinumCreditCard(5000.0, 10000.0,  100.0);
        System.out.println("\nПлатиновая кредитная карта:");
        System.out.println("Баланс: " + platinumCreditCard.getBalance());
        System.out.println("Кредитный лимит: " + platinumCreditCard.getCreditLimit());
        System.out.println("Доступные средства на платиновой кредитной карте: " + platinumCreditCard.getAvailableFunds());

        // Пополнение дебетовой карты
        goldDebitCard.deposit(2000.0);
        System.out.println("\nПополнение золотой дебетовой карты на 2000:");
        System.out.println("Баланс: " + goldDebitCard.getBalance());
        System.out.println("Доступные средства средства на золотой кредитной карте: " + goldDebitCard.getAvailableFunds());

        // Оплата кредитной карты
        platinumCreditCard.withdraw(3000.0);
        System.out.println("\nОплата платиновой кредитной картой на 3000:");
        System.out.println("Баланс: " + platinumCreditCard.getBalance());
        System.out.println("Доступные средства на платиновой кредитной карте: " + platinumCreditCard.getAvailableFunds());
    }
}