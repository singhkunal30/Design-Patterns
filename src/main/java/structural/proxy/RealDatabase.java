package structural.proxy;

//Subject
public class RealDatabase implements Database {

	private String connectionString;

	public RealDatabase(String connectionString) {
		this.connectionString = connectionString;
		connect(); // Create a connection when instantiated
	}

	public void connect() {
		System.out.println("Connecting to database: " + connectionString);
	}

	public void disconnect() {
		System.out.println("Disconnecting from database: " + connectionString);
	}
}