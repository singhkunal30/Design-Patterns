package behavioral.chainofresponsibility;

public class BranchManagerHandler extends RequestHandler {
	@Override
	public void handleRequest(double amount) {
		if (amount >= 1000 && amount < 5000) {
			System.out.println("Branch Manager approves the request of $" + amount);
		} else if (nextHandler != null) {
			nextHandler.handleRequest(amount);
		}
	}
}