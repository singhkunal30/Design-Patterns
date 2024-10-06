package structural.proxy;

public class Main {
	public static void main(String[] args) {
		// Create a proxy for the database
		Database dbProxy = new DatabaseProxy("my-database-url");

		// Database connection is not made yet
		System.out.println("Before connecting to the database");

		// Now, the connection is made when connect() is called
		dbProxy.connect();

		// Disconnecting
		dbProxy.disconnect();
	}
}
