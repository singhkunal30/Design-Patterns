package behavioral.visitor.element;

import behavioral.visitor.visitors.ShoppingCartVisitor;

public class Book implements ItemElement {
	private int price;
	private String isbn;

	public Book(int price, String isbn) {
		this.price = price;
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbn() {
		return isbn;
	}

	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
