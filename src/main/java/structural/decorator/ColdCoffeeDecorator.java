package structural.decorator;

public class ColdCoffeeDecorator extends CoffeeDecorator {

	public ColdCoffeeDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public int getCost() {
		return super.getCost() + 150;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Cold";
	}

}
