package behavioral.intercepter;

public class AdditionExpression implements Expression {
	private Expression leftExpression;
	private Expression rightExpression;

	public AdditionExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	public int interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}
}
