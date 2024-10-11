package behavioral.visitor;

import behavioral.visitor.element.Book;
import behavioral.visitor.element.Electronic;
import behavioral.visitor.element.ItemElement;
import behavioral.visitor.visitors.ShoppingCartVisitor;
import behavioral.visitor.visitors.ShoppingCartVisitorImpl;

public class ShoppingCartClient {
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(60, "1234"), new Book(40, "5678"),
				new Electronic(200, "Laptop"), new Electronic(80, "Headphones") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}
}
