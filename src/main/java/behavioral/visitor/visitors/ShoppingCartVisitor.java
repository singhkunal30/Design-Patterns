package behavioral.visitor.visitors;

import behavioral.visitor.element.Book;
import behavioral.visitor.element.Electronic;

//Visitor Interface
public interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Electronic electronic);
}
