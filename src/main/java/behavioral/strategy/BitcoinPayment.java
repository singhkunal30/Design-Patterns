package behavioral.strategy;

public class BitcoinPayment implements PaymentStrategy {
    private final String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin wallet: " + walletAddress);
    }
}