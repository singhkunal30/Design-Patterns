package behavioral.visitor.visitors;

import behavioral.visitor.element.Book;
import behavioral.visitor.element.Electronic;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	public int visit(Book book) {
		int cost;
		// Apply a discount for books over $50
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}
		System.out.println("Book ISBN: " + book.getIsbn() + " cost = " + cost);
		return cost;
	}

	public int visit(Electronic electronic) {
		int cost;
		// Apply a discount for electronics with price over $100
		if (electronic.getPrice() > 100) {
			cost = electronic.getPrice() - 10;
		} else {
			cost = electronic.getPrice();
		}
		System.out.println("Electronic Item: " + electronic.getModel() + " cost = " + cost);
		return cost;
	}
}
