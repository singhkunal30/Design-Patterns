package behavioral.chainofresponsibility;

public abstract class RequestHandler {
	protected RequestHandler nextHandler;

	public void setNextHandler(RequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract void handleRequest(double amount);
}
