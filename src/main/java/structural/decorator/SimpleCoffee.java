package structural.decorator;

public class SimpleCoffee implements Coffee {
	
	public int getCost() {
		return 200;
	}

	public String getDescription() {
		return "Simple Coffee";		
	}
	
}
