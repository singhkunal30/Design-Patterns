package behavioral.state;

public class SoldOutState implements VendingMachineState {
	private final VendingMachine vendingMachine;

	public SoldOutState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public void insertMoney() {
		System.out.println("Machine is sold out. Cannot insert money.");
	}

	public void dispenseItem() {
		System.out.println("No items available.");
	}
}
