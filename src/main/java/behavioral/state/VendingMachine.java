package behavioral.state;

public class VendingMachine {
    private final VendingMachineState idleState;
    private final VendingMachineState hasMoneyState;
    private final VendingMachineState soldOutState;
    
    private VendingMachineState currentState;

    public VendingMachine() {
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this);
        soldOutState = new SoldOutState(this);
        
        // Initial state of the vending machine
        currentState = idleState;
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getHasMoneyState() {
        return hasMoneyState;
    }

    public VendingMachineState getSoldOutState() {
        return soldOutState;
    }
}
