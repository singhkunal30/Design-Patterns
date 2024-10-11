package behavioral.state;

public class IdleState implements VendingMachineState {
	private final VendingMachine vendingMachine;

	public IdleState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public void insertMoney() {
		System.out.println("Money inserted.");
		vendingMachine.setState(vendingMachine.getHasMoneyState());
	}

	public void dispenseItem() {
		System.out.println("Please insert money first.");
	}
}