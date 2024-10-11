package behavioral.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		
		RequestHandler teller = new TellerHandler();
		RequestHandler branchManager = new BranchManagerHandler();
		RequestHandler regionalManager = new RegionalManagerHandler();

		teller.setNextHandler(branchManager);
		branchManager.setNextHandler(regionalManager);

		teller.handleRequest(500); // Teller approves the request
		teller.handleRequest(2500); // Branch Manager approves the request
		teller.handleRequest(7000); // Regional Manager approves the request
	}
}
