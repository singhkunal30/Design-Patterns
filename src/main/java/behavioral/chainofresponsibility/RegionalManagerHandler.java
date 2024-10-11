package behavioral.chainofresponsibility;

public class RegionalManagerHandler extends RequestHandler {
	@Override
	public void handleRequest(double amount) {
		if (amount >= 5000) {
			System.out.println("Regional Manager approves the request of $" + amount);
		} else if (nextHandler != null) {
			nextHandler.handleRequest(amount);
		}
	}
}