package behavioral.strategy;

public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Using a CreditCardPayment strategy
		cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
		cart.checkout(100.00);

		// Changing to PayPalPayment strategy at runtime
		cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
		cart.checkout(200.00);

		// Changing to BitcoinPayment strategy
		cart.setPaymentStrategy(new BitcoinPayment("abc123xyz"));
		cart.checkout(300.00);
	}
}
