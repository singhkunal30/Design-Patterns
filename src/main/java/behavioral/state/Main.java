package behavioral.state;

public class Main {
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();

		// Test scenario
		vendingMachine.insertMoney(); // Inserting money
		vendingMachine.dispenseItem(); // Dispensing item

		// Try dispensing again without inserting money
		vendingMachine.dispenseItem(); // Should show "Please insert money first."

		// Inserting money when in HasMoneyState
		vendingMachine.insertMoney(); // Should show "Money already inserted."
	}
}
