package behavioral.visitor.element;

import behavioral.visitor.visitors.ShoppingCartVisitor;

public class Electronic implements ItemElement {
	private int price;
	private String model;

	public Electronic(int price, String model) {
		this.price = price;
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public String getModel() {
		return model;
	}

	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}