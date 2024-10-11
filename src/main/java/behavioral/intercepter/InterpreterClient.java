package behavioral.intercepter;

import java.util.Stack;

public class InterpreterClient {
	public static Expression parse(String expression) {
		Stack<Expression> stack = new Stack<Expression>();

		String[] tokens = expression.split(" ");
		for (String token : tokens) {
			if (token.equals("+")) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression add = new AdditionExpression(left, right);
				stack.push(add);
			} else if (token.equals("-")) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression subtract = new SubtractionExpression(left, right);
				stack.push(subtract);
			} else {
				Expression number = new NumberExpression(Integer.parseInt(token));
				stack.push(number);
			}
		}

		return stack.pop(); // Final expression representing the full AST
	}

	public static void main(String[] args) {
		String expression = "5 2 + 3 -"; // Equivalent to: (5 + 2) - 3
		Expression parsedExpression = InterpreterClient.parse(expression);
		int result = parsedExpression.interpret();
		System.out.println("Result: " + result); // Output: 4
	}
}
