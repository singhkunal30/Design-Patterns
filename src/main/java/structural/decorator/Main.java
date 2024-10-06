package structural.decorator;

public class Main {

	public static void main(String[] args) {
		// Create simple coffee
		Coffee myCoffee = new SimpleCoffee();
		System.out.println(myCoffee.getDescription() + " Rs." + myCoffee.getCost());

		// Make it cold
		myCoffee = new ColdCoffeeDecorator(myCoffee);
		System.out.println(myCoffee.getDescription() + " Rs." + myCoffee.getCost());

		// Add sugar to coffee
		myCoffee = new SugarDecorator(myCoffee);
		System.out.println(myCoffee.getDescription() + " Rs." + myCoffee.getCost());
	}

}
