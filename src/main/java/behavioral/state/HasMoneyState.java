package behavioral.state;

public class HasMoneyState implements VendingMachineState {
	private final VendingMachine vendingMachine;

	public HasMoneyState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public void insertMoney() {
		System.out.println("Money already inserted.");
	}

	public void dispenseItem() {
		System.out.println("Item dispensed.");
		vendingMachine.setState(vendingMachine.getIdleState());
	}
}