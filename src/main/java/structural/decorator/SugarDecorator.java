package structural.decorator;

public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public int getCost() {
		return super.getCost() + 50; // add sugar cost
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Sugar";
	}
}