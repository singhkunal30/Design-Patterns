package structural.decorator;

public class CoffeeDecorator implements Coffee{
	
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}
	
	public int getCost() {
		return decoratedCoffee.getCost();
	}

	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

}
