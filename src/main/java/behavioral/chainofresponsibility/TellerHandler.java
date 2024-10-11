package behavioral.chainofresponsibility;

public class TellerHandler extends RequestHandler {

	@Override
	public void handleRequest(double amount) {
		if (amount < 1000) {
			System.out.println("Amount is approved by teller");
		} else if (nextHandler != null) {
			nextHandler.handleRequest(amount);
		}
	}

}
