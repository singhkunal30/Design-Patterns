package behavioral.visitor.element;

import behavioral.visitor.visitors.ShoppingCartVisitor;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}
